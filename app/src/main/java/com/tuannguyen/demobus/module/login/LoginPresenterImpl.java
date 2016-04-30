package com.tuannguyen.demobus.module.login;

import com.squareup.otto.Subscribe;
import com.tuannguyen.demobus.DemoApplication;
import com.tuannguyen.demobus.model.LoginResponse;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public class LoginPresenterImpl implements LoginPresenter {
    LoginView mLoginView;
    LoginIteractor mLoginIteractor;

    @Override
    public void setView(LoginView view) {
        this.mLoginView = view;
        this.mLoginIteractor = new LoginIteractorImpl();
        DemoApplication.getBus().register(this);
    }

    @Override
    public void onDestroy() {
        DemoApplication.getBus().unregister(this);
        mLoginView = null;
        mLoginIteractor.getRequestQueue();
        mLoginIteractor.onDestroy();
        mLoginIteractor = null;
    }

    @Override
    public void login(String username, String password) {
        mLoginView.showProgress();
        mLoginIteractor.login(username, password);
    }

    @Subscribe
    public void handleLogin(LoginResponse loginInfo) {
        mLoginView.hideProgress();
        //logic
        if (loginInfo.getCode() == 0) {
            mLoginView.showHomeScreen(loginInfo);
        } else {
            mLoginView.showToast(loginInfo.getMsg());
        }
    }
}
