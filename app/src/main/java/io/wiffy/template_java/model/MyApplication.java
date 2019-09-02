package io.wiffy.template_java.model;

import android.app.Application;

import io.wiffy.template_java.object.Component;

public class MyApplication extends Application implements SuperContract.WiffyObject {
    @Override
    public void onCreate() {
        super.onCreate();

        Component.getInstance().sharedPreferences =
                getSharedPreferences()

    }

    @Override
    public int console(String tag, String str) {
        return 0;
    }

    @Override
    public int console(String str) {
        return 0;
    }
}
