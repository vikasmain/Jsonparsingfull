package com.example.dell.wasa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class a extends Activity {
    private static final String TAG = newp.class.getSimpleName();
    public static final String Title="urlvideo";
    Button button;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_main.xml
        setContentView(R.layout.jk);


        TextView textView=(TextView)findViewById(R.id.tjr);
        textView.setText("Name:"+getIntent().getStringExtra(Title));
        textView.setTextSize(45);
    }

}
