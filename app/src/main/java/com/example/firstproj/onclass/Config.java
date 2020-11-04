package com.example.firstproj.onclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.firstproj.R;

public class Config extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

    }
    public void Save(){
        EditText text1 = findViewById(R.id.text1);
        EditText text2 = findViewById(R.id.text2);
        EditText text3 = findViewById(R.id.text3);
        Button save = findViewById(R.id.save);


    }
}