package com.tuannguyen.demobus.base;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public interface BasePresenter<V> {
    void setView(V view);
    void onDestroy();
}
