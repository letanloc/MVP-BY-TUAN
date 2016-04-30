package com.tuannguyen.demobus.module.login;

import com.tuannguyen.demobus.base.BasePresenter;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public interface LoginPresenter extends BasePresenter<LoginView> {
    void login(String username, String password);

}
