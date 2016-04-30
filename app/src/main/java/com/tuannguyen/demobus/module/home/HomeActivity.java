package com.tuannguyen.demobus.module.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tuannguyen.demobus.R;
import com.tuannguyen.demobus.base.BaseActivity;

public class HomeActivity extends BaseActivity implements HomeView{

    HomePresenter mHomePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mHomePresenter = new HomePresenterImpl();
        mHomePresenter.setView(this);
    }
}
