package com.tuannguyen.demobus.module.home;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public class HomePresenterImpl implements HomePresenter {
    HomeView mHomeView;
    @Override
    public void setView(HomeView view) {
        this.mHomeView = view;
    }

    @Override
    public void onDestroy() {
        mHomeView = null;
    }
}
