package com.example.vikas.wasa;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

public class Notify extends AppCompatActivity {

    private static Activity currentActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OneSignal.startInit(this).setNotificationOpenedHandler(new ExampleNotificationOpenHandler()).init();
        setContentView(R.layout.notify);


    }
    private  class ExampleNotificationOpenHandler implements OneSignal.NotificationOpenedHandler{


        @Override
        public void notificationOpened(OSNotificationOpenResult result) {

        }
    }
}