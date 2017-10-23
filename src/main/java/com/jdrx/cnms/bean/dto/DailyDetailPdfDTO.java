package com.jdrx.cnms.bean.dto;


/**
 * Created by dwz on 2017/7/4.
 */
public class DailyDetailPdfDTO {
    private String html;
    private String time;
    private String path;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
