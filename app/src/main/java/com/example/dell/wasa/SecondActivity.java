package com.example.dell.wasa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by dell on 12/25/2016.
 */
public class SecondActivity extends Activity {
    public final static String Message_key="com.example.dell.chotajson.message_key";
private static String Title="title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setContentView(R.layout.pr);
        Intent in1=getIntent();
        String name= in1.getStringExtra(Title);
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(name);
    textView.setTextSize(45);
    }
}
