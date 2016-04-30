package com.tuannguyen.demobus.base;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public class BaseActivity extends AppCompatActivity implements BaseView {
    @Override
    public void showProgress() {
        //show progress here
    }

    @Override
    public void hideProgress() {
        //hide progress here
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
