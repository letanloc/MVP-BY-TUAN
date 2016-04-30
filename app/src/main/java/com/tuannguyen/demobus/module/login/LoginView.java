package com.tuannguyen.demobus.module.login;

import com.tuannguyen.demobus.base.BaseView;
import com.tuannguyen.demobus.model.LoginResponse;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public interface LoginView extends BaseView {
    void showHomeScreen(LoginResponse loginInfo);

    void showProgress();

    void hideProgress();
}
