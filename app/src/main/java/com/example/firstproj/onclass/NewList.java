package com.example.firstproj.onclass;

import android.os.Bundle;

import com.example.firstproj.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NewList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_list);

        List listItems = new ArrayList<HashMap<String,String>>();
        for(int i = 0; i < 10; i ++){
            HashMap<String,String> map = new HashMap<String, String>();
            map.put("ItemTitle","Rate: "+i);
            map.put("ItemDetail","detail"+i);
            listItems.add(map);
        }

        Adapter listItemAdapter = new SimpleAdapter(this,listItems,R.layout.activity_new_list,
                new String[]{"ItemTitle","ItemDetail"}, new int[]{R.id.itemTitle,R.id.itemDetail});

    }


}