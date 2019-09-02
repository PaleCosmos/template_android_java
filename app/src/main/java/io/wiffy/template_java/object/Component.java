package io.wiffy.template_java.object;

import android.content.SharedPreferences;

public class Component {

    //Singleton pattern

    private static Component component = null;
    public static final Long delay = 1000L;

    private Component()
    {

    }

    public static Component getInstance(){
        if(component==null)
        {
            component = new Component();
        }
        return component;
    }

    public String version = "1.0.0";

    public SharedPreferences sharedPreferences = null;

}
