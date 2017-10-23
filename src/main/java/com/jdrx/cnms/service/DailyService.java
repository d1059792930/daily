package com.jdrx.cnms.service;

import com.jdrx.cnms.bean.dto.*;
import com.jdrx.cnms.dao.DailyRemarkMapper;
import com.jdrx.cnms.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;
import java.util.Map;

/**
 * 日报服务
 * Created by dwz on 2017/9/4.
 */
@Service
public class DailyService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DailyRemarkMapper dailyRemarkMapper;
    /**
     * 获取日报分页数据
     * @param dailyPageDTO
     * @return
     */
    public Page<Map<String,Object>> getDailyPage(DailyPageDTO dailyPageDTO) {
        Page<Map<String, Object>> page = new Page<>();
        page.setPageNo(dailyPageDTO.getPageNo());
        page.setPageSize(dailyPageDTO.getPageSize());
        StringBuffer sql=new StringBuffer("select i.iid_id id,date_format(i.time,'%Y-%c-%d %H:%i:%s') time,'吉林互联网运行日报' name,date_format(i.editTime,'%Y-%c-%d %H:%i:%s') editTime,i.remark,i.editor from important_indicators_daily i where 1=1 ");
        if (!StringUtils.isEmpty(dailyPageDTO.getStartTime())){
            sql.append(" and i.time >= '"+dailyPageDTO.getStartTime()+"'");
        }
        if (!StringUtils.isEmpty(dailyPageDTO.getEndTime())){
            sql.append(" and i.time < '"+dailyPageDTO.getEndTime()+"'");
        }
        sql.append(" order by i.time desc");
        StringBuffer countSql=new StringBuffer(" select count(1) from ("+sql.toString()+") a");
        String limit=" limit "+(page.getPageNo()-1)*page.getPageSize()+","+page.getPageSize();
        sql.append(limit);
        //先设置count，再设置list
        int count = jdbcTemplate.queryForObject(countSql.toString(),Integer.class);
        page.setCount(count);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql.toString());
        page.setList(list);
        return page;
    }

    /**
     * 获取日报指标详单
     * @param timeDTO
     * @return
     */
    public List<Map<String,Object>> getDailyDetail(TimeDTO timeDTO) {
        //1971-01-01 00:00:00是基准数据表的数据
        StringBuffer sql=new StringBuffer(" select * from daily_detail where time='1971-01-01 00:00:00'");
        if (!StringUtils.isEmpty(timeDTO.getDateTime())){
            sql.append(" or (time BETWEEN '"+timeDTO.getDateTime()+" 00:00:00' AND '"+timeDTO.getDateTime()+" 23:59:59')");
        }
        sql.append(" order by time desc ");
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql.toString());
        return list;
    }

    /**
     * 修改日报
     * @param remarkDTO
     */
    @Transactional
    public void updateRemark(RemarkDTO remarkDTO) {
        dailyRemarkMapper.updateRemark(remarkDTO);
    }
}

