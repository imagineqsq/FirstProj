package com.example.firstproj;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final TextView textView = findViewById(R.id.tv2);
//        textView.setText("hello android");
        final TextView ttv = findViewById(R.id.ttv);
        EditText input = findViewById(R.id.tp2);
        String str = input.getText().toString();
        float cc = Float.valueOf(str);
        final double ff = cc*1.8 + 32;
        Button bt = findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ttv.setText(String.valueOf(ff));
            }
        });

//        Log.i("login", "onCreate");


    }
}