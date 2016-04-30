package com.tuannguyen.demobus.base;

import com.android.volley.RequestQueue;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public interface BaseInteractor {
    RequestQueue getRequestQueue();
    void onDestroy();
}
