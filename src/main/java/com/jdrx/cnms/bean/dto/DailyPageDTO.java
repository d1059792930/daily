package com.jdrx.cnms.bean.dto;


/**
 * Created by aw on 2017/8/29.
 */
public class DailyPageDTO {
    private int pageNo = 1;
    private int pageSize = 20;
    private String startTime;
    private String endTime;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
