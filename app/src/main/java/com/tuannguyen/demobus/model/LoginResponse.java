package com.tuannguyen.demobus.model;

import com.tuannguyen.demobus.base.BaseModel;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public class LoginResponse extends BaseModel {
    private String userName;
    private String address;
    private String mobile;

    public LoginResponse(
            int code, String msg) {
        super(code, msg);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
