package com.tuannguyen.demobus;

import android.app.Application;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by NguyenMinhTuan on 4/28/16.
 */
public class DemoApplication extends Application {
    private static DemoApplication mInstance;
    Bus mBus = new Bus(ThreadEnforcer.MAIN);

    // thể hiện của một lớp
    /// this is called  a singleton(v2)
    public static DemoApplication getInstance() {
        return mInstance;
    }

    public DemoApplication() {
        this.mInstance = this;

    }

    public static Bus getBus() {
        return DemoApplication.getInstance().mBus;
    }
}
