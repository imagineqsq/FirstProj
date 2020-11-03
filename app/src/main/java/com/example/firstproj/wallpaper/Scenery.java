package com.example.firstproj.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.firstproj.R;

import java.util.ArrayList;

public class Scenery extends AppCompatActivity implements View.OnClickListener {
    private Button pre,next;
    private ImageView pic;
    private ArrayList<String> urls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scenery);


    }

    @Override
    public void onClick(View v) {

    }
}