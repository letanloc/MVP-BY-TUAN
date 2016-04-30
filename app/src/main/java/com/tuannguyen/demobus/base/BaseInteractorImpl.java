package com.tuannguyen.demobus.base;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.tuannguyen.demobus.DemoApplication;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public class BaseInteractorImpl implements BaseInteractor {
    RequestQueue mRequestQueue;
    @Override
    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(DemoApplication.getInstance());
        }
        return mRequestQueue;
    }

    @Override
    public void onDestroy() {
        mRequestQueue = null;
    }


}
