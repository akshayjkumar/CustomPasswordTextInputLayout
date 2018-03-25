package ajdev.com.ltrtlpasswordtextinputlayout;

import android.app.Application;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * Created by Akshay.Jayakumar on 3/25/2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Un-comment below to change the application locale to Arabic.
        //changeLocale("ar");
    }

    /**
     * This is the older way of Changing/ Handling locale changes in Android.
     * Newer APIs are available since Android 6 and above which does not involves
     * updateConfiguration(). This method is deprecated. This is only for
     * demonstration purposes.
     *
     * @param lang
     */
    public void changeLocale(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
    }
}
