package template.palecosmos.template_java.ui.main;

import android.os.Bundle;

import template.palecosmos.template_java.R;

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
}
