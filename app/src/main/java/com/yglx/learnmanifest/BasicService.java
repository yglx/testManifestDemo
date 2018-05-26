package com.yglx.learnmanifest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BasicService extends Service {
    public BasicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
