package template.palecosmos.template_java.ui.splash;

import template.palecosmos.template_java.model.SuperContract;

interface SplashContract {
    abstract class View extends SuperContract.SuperActivity{
        abstract void initView();
        abstract void moveToMain();
    }

    interface Presenter extends SuperContract.SuperPresenter{
        void check();
    }
}
