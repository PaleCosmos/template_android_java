package io.wiffy.template_java.ui.main;

class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    MainPresenter(MainContract.View mView) {
        this.mView = mView;
    }

    @Override
    public int console(String str) {
        return 0;
    }

    @Override
    public int console(String tag, String str) {
        return 0;
    }

    @Override
    public void initPresent() {
        mView.initView();
    }
}
