package io.wiffy.template_java.ui.splash;

import io.wiffy.template_java.model.SuperContract;

interface SplashContract {
    abstract class View extends SuperContract.SuperActivity{
        abstract void initView();
        abstract void moveToMain();
    }

    interface Presenter extends SuperContract.SuperPresenter{
        void check();
    }
}
