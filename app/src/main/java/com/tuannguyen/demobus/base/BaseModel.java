package com.tuannguyen.demobus.base;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public class BaseModel {
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

        public void setMsg(String msg) {
        this.msg = msg;
    }
    public BaseModel(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
