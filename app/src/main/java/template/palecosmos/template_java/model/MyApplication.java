package template.palecosmos.template_java.model;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

import template.palecosmos.template_java.function.dataIO;
import template.palecosmos.template_java.object.Component;

public class MyApplication extends Application implements SuperContract.AndroidInterface {
    @Override
    public void onCreate() {
        super.onCreate();

        Component.getInstance().sharedPreferences =
                getSharedPreferences(dataIO.appConstantPreferences, Context.MODE_PRIVATE);

        try {
            Component.getInstance().version = getApplicationContext().getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException ignored) {
        }
        // manage your app component
    }

    @Override
    public int console(String str) {
        return Log.d("'asdf", str);
    }

    @Override
    public int console(String tag, String str) {
        return Log.d(tag, str);
    }
}
