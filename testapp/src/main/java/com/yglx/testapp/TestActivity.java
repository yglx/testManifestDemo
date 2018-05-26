package com.yglx.testapp;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void startAnoAct(View view) {
        Intent intent = new Intent();
       // intent.setAction("com.yglx.learnmanifext.sdfasdfasdf");
        //intent.setAction("com.yglx.learnmanifext.oneAction");
       // intent.addCategory("com.yglx.oneaction");
        intent.setDataAndType(Uri.parse("http://www.baidu.com"),"video/mgie");
       // intent.setData(Uri.parse("http://www.baidu.com"));
//                intent.addCategory("com.yglx.appss");

//                intent.setType()
//        显示启动
//        Intent intent = new Intent();
//        intent.setComponent(new ComponentName("com.yglx.learnmanifest","com.yglx.learnmanifest.BasicActivity"));

//        startActivity(intent);
        Intent chooser = Intent.createChooser(intent,"choose");
        if (chooser.resolveActivity(getPackageManager()) != null) {
            startActivity(chooser);
        }else {
            Toast.makeText(this, "cannot find activity to start", Toast.LENGTH_SHORT).show();
        }
    }

    public void startAnoservice(View view) {
        Intent intent = new Intent("cn.jpush.android.intent.DaemonService");

    }
}
