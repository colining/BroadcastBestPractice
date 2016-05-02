package com.example.asus.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by asus on 2016/5/2.
 */
public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);


    }
    @Override
    protected void  onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
