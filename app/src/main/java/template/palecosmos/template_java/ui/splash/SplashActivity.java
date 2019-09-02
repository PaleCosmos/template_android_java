package template.palecosmos.template_java.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.Nullable;

import template.palecosmos.template_java.R;
import template.palecosmos.template_java.object.Component;
import template.palecosmos.template_java.ui.main.MainActivity;

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
        // View Init
        mPresenter.check();
    }

    @Override
    void moveToMain() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                overridePendingTransition(R.anim.abc_fade_in, R.anim.not_move_activity);
                finish();
            }
        }, Component.delay);
    }
}
