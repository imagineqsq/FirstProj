package com.example.firstproj.wallpaper;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.firstproj.R;

import java.util.ArrayList;


public class FirstFragment extends Fragment {

    private Button pre,next;
    private ImageView pic;
    private ArrayList<String> urls;
    private int[] img = {R.drawable.ic_cartoon,R.drawable.ic_foods,R.drawable.ic_scenery};
    private int num = 0;
    private PicLoader loader;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first,null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        pic = getView().findViewById(R.id.pic);
        pre = getView().findViewById(R.id.pre);
        next = getView().findViewById(R.id.next);

    }

    @Override
    public void onResume() {
        super.onResume();

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num<=0){
                    num=3;
                }
                    pic.setImageResource(img[--num]);


            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num>=2){
                    num=-1;
                }
                pic.setImageResource(img[++num]);
            }
        });
    }
}