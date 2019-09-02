package io.wiffy.template_java.ui.main;

import android.os.Bundle;

import io.wiffy.template_java.R;

public class MainActivity extends MainContract.View {

    MainPresenter mPresenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
        mPresenter.initPresent();
    }

    @Override
    void initView() {
        //init view
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
