package com.jdrx.cnms.bean;

public class ResponseFactory {
    public ResponseFactory() {
    }

    public static ResposeVO ok(Object obj) {
        ResposeVO vo = new ResposeVO();
        vo.setData(obj);
        vo.setMessage("success");
        vo.setStatus("0");
        return vo;
    }

    public static ResposeVO err(String obj) {
        ResposeVO vo = new ResposeVO();
        vo.setMessage(obj);
        vo.setStatus("1");
        return vo;
    }
}
