package com.loonggg.alarmmanager.clock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by loongggdroid on 2016/3/21.
 */
public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: " + "收到闹钟");
    }

    public void onMyReceive(Context context, Intent intent){

    };
}
