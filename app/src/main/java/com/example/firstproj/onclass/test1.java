package com.example.firstproj.onclass;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstproj.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test1 extends AppCompatActivity {
    private String[] names = new String[]{"A","B","C","D"};
    private String[] says = new String[]{"111","222","333","444"};
    private int[] imgIds = new int[]{R.mipmap.birth,R.mipmap.birth,R.mipmap.birth,R.mipmap.birth};

    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.test1);

        List<Map<String,Object>> listitem = new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("touxiang",imgIds[i]);
            showitem.put("name",names[i]);
            showitem.put("says",says[i]);
            listitem.add(showitem);
        }

        SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(),listitem,R.layout.test1,
                new String[]{"touxiang","name","says"},new int[]{R.id.imagtou,R.id.name,R.id.says});
        ListView listView = (ListView) findViewById(R.id.ls);
        listView.setAdapter(myAdapter);

    }
}
