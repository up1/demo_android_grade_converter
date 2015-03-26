package com.example;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.view.WindowManager;

public abstract class EspressoSpec <T extends Activity> extends ActivityInstrumentationTestCase2<T> {

    public EspressoSpec(Class<T> activityClass) {
        super(activityClass);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                Activity activity = getActivity();
                activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
                activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
                activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
                activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
                activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            }
        });
    }
}
