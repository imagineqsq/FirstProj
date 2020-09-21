package com.example.firstproj;


import android.os.Bundle;
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

        Button bt1 = (Button)findViewById(R.id.bt1);
        Button bt2 = (Button)findViewById(R.id.bt2);
        Button bt3 = (Button)findViewById(R.id.bt3);
        Button bt4 = (Button)findViewById(R.id.bt4);
        final EditText num = (EditText)findViewById(R.id.num);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(String.valueOf(num.getText()));
                String scores = String.valueOf(score+3);
                num.setText(scores);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(String.valueOf(num.getText()));
                String scores = String.valueOf(score+2);
                num.setText(scores);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(String.valueOf(num.getText()));
                String scores = String.valueOf(score+1);
                num.setText(scores);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText("0");
            }
        });

    }


}