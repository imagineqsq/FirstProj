package com.example.firstproj.wallpaper;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import com.example.firstproj.R;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallpaper);

        Button sce = findViewById(R.id.scenery);
        sce.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this,Scenery.class);
                startActivity(intent);
            }
        });

        Button bea = findViewById(R.id.beauty);
        sce.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this, Foods.class);
                startActivity(intent);
            }
        });

        Button car = findViewById(R.id.cartoon);
        sce.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this,Cartoon.class);
                startActivity(intent);
            }
        });

    }
}