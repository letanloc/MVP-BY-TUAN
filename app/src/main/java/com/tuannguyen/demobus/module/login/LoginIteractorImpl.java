package com.tuannguyen.demobus.module.login;

import com.tuannguyen.demobus.DemoApplication;
import com.tuannguyen.demobus.base.BaseInteractorImpl;
import com.tuannguyen.demobus.model.LoginResponse;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public class LoginIteractorImpl extends BaseInteractorImpl implements LoginIteractor {
    String serveName = "http://52.77.218.155:8080";
    String apiLogin = serveName + "/login";

    @Override
    public void login(String username, String password) {
        //goi API lay du lieu
        DemoApplication.getBus().post(new LoginResponse(0, "dang nhap thanh cong"));
//        try {
//
//            JSONObject params = new JSONObject();
//            params.put("username", username);
//            params.put("password", password);
//            GSonRequest<LoginResponse> myRequest = new GSonRequest<LoginResponse>(true, apiLogin, LoginResponse.class, DemoApplication.getInstance().getApplicationContext(), params, new Response.Listener<LoginResponse>() {
//                @Override
//                public void onResponse(LoginResponse response) {
//                    DemoApplication.getBus().post(response);
//                }
//            }, new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//                    DemoApplication.getBus().post(new LoginResponse(1, "loi dang nhap " + error.getMessage()));
//                }
//            });
//            getRequestQueue().add(myRequest);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }
}
