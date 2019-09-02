package template.palecosmos.template_java.ui.splash;

class SplashPresenter implements SplashContract.Presenter {

    private SplashContract.View mView;

    SplashPresenter(SplashContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void initPresent() {
        mView.initView();
    }

    @Override
    public void check() {
        // input your checker
        mView.moveToMain();
    }

    @Override
    public int console(String str) {
        return 0;
    }

    @Override
    public int console(String tag, String str) {
        return 0;
    }
}
