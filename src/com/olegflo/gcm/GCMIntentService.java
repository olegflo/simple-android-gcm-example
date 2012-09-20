package com.olegflo.gcm;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gcm.GCMBaseIntentService;

/**
 * User: Oleg Soroka
 * Date: 20.09.12
 * Time: 21:37
 */
public class GCMIntentService extends GCMBaseIntentService {

    private static final String TAG = "GCM Android : GCMIntentService";

    public GCMIntentService() {
        super(Config.SENDER_ID);
    }

    @Override
    protected void onMessage(Context context, Intent intent) {
        Log.i(TAG, "onMessage");
    }

    @Override
    protected void onError(Context context, String errorId) {
        Log.i(TAG, "onError, errorId=" + errorId);
    }

    @Override
    protected void onRegistered(Context context, String registrationId) {
        Log.i(TAG, "onRegistered, registrationId=" + registrationId);
    }

    @Override
    protected void onUnregistered(Context context, String registrationId) {
        Log.i(TAG, "onUnregistered, registrationId=" + registrationId);
    }
}