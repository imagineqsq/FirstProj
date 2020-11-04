package com.example.firstproj.picnote;

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


public class FirstFragment extends Fragment {

    private Button pre,next;
    private ImageView pic;
    private int[] img = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8};
    private int num = 0;

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
                    num=8;
                }
                    pic.setImageResource(img[--num]);


            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num>=7){
                    num=-1;
                }
                pic.setImageResource(img[++num]);
            }
        });
    }
}