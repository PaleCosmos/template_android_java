package io.wiffy.template_java.ui.splash;

import android.os.Bundle;

import androidx.annotation.Nullable;

import io.wiffy.template_java.R;

public class SplashActivity extends SplashContract.View {

    SplashPresenter mPresenter = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mPresenter = new SplashPresenter(this);
        mPresenter.initPresent();
    }

    @Override
    void initView() {

    }

    @Override
    void moveToMain() {

    }

    @Override
    public int console(String str) {
        return super.console(str);
    }

    @Override
    public int console(String tag, String str) {
        return super.console(tag, str);
    }
}
