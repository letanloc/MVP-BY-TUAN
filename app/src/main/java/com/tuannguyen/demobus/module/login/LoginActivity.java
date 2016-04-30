package com.tuannguyen.demobus.module.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tuannguyen.demobus.R;
import com.tuannguyen.demobus.base.BaseActivity;
import com.tuannguyen.demobus.model.LoginResponse;
import com.tuannguyen.demobus.module.home.HomeActivity;

public class LoginActivity extends BaseActivity implements LoginView {

    LoginPresenter mLoginPresenter;
    Button mLoginBtn, mRegisterBtn;
    EditText mUsername, mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginPresenter = new LoginPresenterImpl();
        mLoginPresenter.setView(this);
        //init layout
        mLoginBtn = (Button)findViewById(R.id.btnLogin);
        mRegisterBtn = (Button)findViewById(R.id.btnRegister);
        mLoginBtn.setOnClickListener(onClickListener);
        mRegisterBtn.setOnClickListener(onClickListener);
        mUsername = (EditText)findViewById(R.id.txtUserName);
        mPassword = (EditText)findViewById(R.id.txtPassword);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view == mLoginBtn){
                mLoginPresenter.login(mUsername.getText().toString().trim(), mPassword.getText().toString().trim());
            }else if (view == mRegisterBtn){

            }
        }
    };


    @Override
    public void showHomeScreen(LoginResponse loginInfo) {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLoginPresenter.onDestroy();
        mLoginPresenter = null;
    }
}
