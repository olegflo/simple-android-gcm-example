package com.olegflo.gcm;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gcm.GCMRegistrar;

public class MainActivity extends Activity {

    String TAG = "GCM Android";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        GCMRegistrar.checkDevice(this);
        GCMRegistrar.checkManifest(this);

        final String regId = GCMRegistrar.getRegistrationId(this);
        Log.v(TAG, "Run GCMRegistrar.getRegistrationId(), regId=" + regId);
        if (regId.equals("")) {
            register();
        } else {
            Log.v(TAG, "Already registered, try to unregister");
            GCMRegistrar.unregister(this);
            register();
        }

    }

    private void register() {
        Log.v(TAG, "Run GCMRegistrar.register(), SENDER_ID=" + Config.SENDER_ID);
        GCMRegistrar.register(this, Config.SENDER_ID);
    }

}