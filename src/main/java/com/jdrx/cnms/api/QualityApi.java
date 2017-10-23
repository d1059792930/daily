package com.jdrx.cnms.api;

import com.jdrx.cnms.bean.ResponseFactory;
import com.jdrx.cnms.bean.ResposeVO;
import com.jdrx.cnms.bean.dto.*;
import com.jdrx.cnms.bean.entity.User;
import com.jdrx.cnms.service.*;
import com.jdrx.cnms.util.PDFUtil;
import com.jdrx.cnms.util.Page;
import com.jdrx.cnms.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by dwz on 2017/6/6.
 */
@RestController
@RequestMapping(value = "/api/0/daily")
//解决跨域问题
@CrossOrigin
public class QualityApi {
    @Autowired
    DailyService dailyService;

    @RequestMapping(value = "getDailyPage", method = RequestMethod.POST)
    @ResponseBody
    public ResposeVO getDailyPage(@RequestBody @Valid DailyPageDTO dailyPageDTO) throws Exception {
        Map<String, Object> map = new HashMap<>();
        Page<Map<String, Object>> page = dailyService.getDailyPage(dailyPageDTO);
        map.put("page", page);
        ResposeVO resposeVO = ResponseFactory.ok(map);
        return resposeVO;
    }

    @RequestMapping(value = "getDailyDetail", method = RequestMethod.POST)
    @ResponseBody
    public ResposeVO getDailyDetail(@RequestBody @Valid TimeDTO timeDTO) throws Exception {
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> list = dailyService.getDailyDetail(timeDTO);
        map.put("list", list);
        ResposeVO resposeVO = ResponseFactory.ok(map);
        return resposeVO;
    }

    @RequestMapping(value = "updateRemark", method = RequestMethod.POST)
    @ResponseBody
    public ResposeVO updateRemark(@RequestBody @Valid RemarkDTO remarkDTO, HttpServletRequest request) throws Exception {
        String token = request.getParameter("dailyToken");
        User user = UserUtil.userMap.get(token);
        remarkDTO.setEditor(user.getLoginName());
        remarkDTO.setEditTime(new Date());
        dailyService.updateRemark(remarkDTO);
        ResposeVO resposeVO = ResponseFactory.ok("修改成功");
        return resposeVO;
    }

    @RequestMapping(value = "getDailyDetailPDF", method = RequestMethod.POST)
    @ResponseBody
    public void getDailyDetailPDF(DailyDetailPdfDTO dailyDetailPdfDTO, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String fileName = "日报-" + dailyDetailPdfDTO.getTime() + ".pdf";
        String userAgent = request.getHeader("User-Agent");
        if (userAgent.contains("MSIE")) {
            fileName = URLEncoder.encode(fileName, "utf-8");
        } else {
            fileName = "=?UTF-8?B?" + new String(org.apache.commons.codec.binary.Base64.encodeBase64(fileName.getBytes("utf-8")), "utf-8") + "?=";
        }
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        response.setContentType("application/pdf");// 设置导出文件格式
        PDFUtil.exportPdfDocument(dailyDetailPdfDTO.getHtml(), dailyDetailPdfDTO.getPath(), response.getOutputStream());
    }
}
