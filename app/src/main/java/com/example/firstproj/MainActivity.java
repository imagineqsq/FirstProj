package com.example.firstproj;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transfer);
    }

    public void config(View view){

        Intent act2 = new Intent(this,Config.class);
        startActivity(act2);

        SharedPreferences sharedPreferences = getSharedPreferences("myrate",Activity.MODE_PRIVATE);
        PreferenceManager.getDefaultSharedPreferences(this);

        Float dollarRate = sharedPreferences.getFloat("dollar_rate",0.0f);
        Float euroRate = sharedPreferences.getFloat("euro_rate",0.0f);
        Float wonRate = sharedPreferences.getFloat("won_rate",0.0f);

        SharedPreferences sp = getSharedPreferences("myrate",Activity.MODE_PRIVATE);

        SharedPreferences.Editor editor = sp.edit();
        editor.putFloat("dollar_rate",dollarRate);
        editor.putFloat("euro_rate",euroRate);
        editor.putFloat("won_rate",wonRate);
        editor.apply();
    }

    static double usd = 6.81;//美元汇率
    static double eu = 7.95;//欧元汇率
    static double kr = 0.0058;//韩元汇率




    public void rmb2usd(View view){
        EditText input = (EditText)findViewById(R.id.input);
        Button dollar_rate = (Button)findViewById(R.id.dollar);
        String ss = input.getText().toString();
        TextView output = (TextView)findViewById(R.id.output);
        if(ss.equals("")){
            Toast.makeText(this, "请输入rmb", Toast.LENGTH_SHORT).show();
        }
        else{
            Double out = Double.valueOf(ss) / usd;
            output.setText(out.toString() + "美元");
        }
    }

    public void rmb2euro(View view){
        EditText input = (EditText)findViewById(R.id.input);
        Button euro_rate = (Button)findViewById(R.id.euro);
        String ss = input.getText().toString();
        TextView output = (TextView)findViewById(R.id.output);
        if(ss.equals("")){
            Toast.makeText(this, "请输入rmb", Toast.LENGTH_SHORT).show();
        }
        else{
            Double out = Double.valueOf(ss) / eu;
            output.setText(out.toString() + "欧元");
        }
    }

    public void rmb2won(View view){
        EditText input = (EditText)findViewById(R.id.input);
        Button won_rate = (Button)findViewById(R.id.won);
        Button config = (Button)findViewById(R.id.config);
        String ss = input.getText().toString();
        TextView output = (TextView)findViewById(R.id.output);
        if(ss.equals("")){
            Toast.makeText(this, "请输入rmb", Toast.LENGTH_SHORT).show();
        }
        else{
            Double out = Double.valueOf(ss) / kr;
            output.setText(out.toString() + "韩元");
        }
    }


}