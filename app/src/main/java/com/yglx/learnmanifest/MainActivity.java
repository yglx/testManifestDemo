package com.yglx.learnmanifest;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.addCategory("asdf");
        PackageManager packageManager = this.getPackageManager();
        ComponentName componentName = new ComponentName("com.yglx.learnmanifest","com.yglx.learnmanifest.BasicActivity");
        packageManager.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP);
//        startActivity(intent);
    }

    public void start(View view) {
        startActivity(new Intent(this, BasicActivity.class));
    }
}
