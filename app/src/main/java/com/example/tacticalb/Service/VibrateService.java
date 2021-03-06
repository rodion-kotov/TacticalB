package com.example.tacticalb.Service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Vibrator;

public class VibrateService extends Service {
    @Override
    public void onStart(Intent intent, int startId) {

        super.onStart(intent, startId);

            long[] pattern = { 0, 40, 20, 40 };
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(pattern, -1);
        }

    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
