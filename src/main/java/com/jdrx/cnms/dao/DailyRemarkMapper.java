package com.jdrx.cnms.dao;

import com.jdrx.cnms.bean.dto.RemarkDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by aw on 2017/8/29.
 * 日报修改批注
 */
@Mapper
public interface DailyRemarkMapper {
    /**
     * 修改批注
     * @param remarkDTO
     */
    void updateRemark(RemarkDTO remarkDTO);
}
