package template.palecosmos.template_java.ui.main;

import template.palecosmos.template_java.model.SuperContract;

interface MainContract {
    abstract class View extends SuperContract.SuperActivity {
        abstract void initView();
    }
    interface Presenter extends SuperContract.SuperPresenter{

    }
}
