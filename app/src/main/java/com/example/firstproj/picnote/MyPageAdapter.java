package com.example.firstproj.picnote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    String[] titles = {"美图","记事本"};

    public MyPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return titles[position];
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FirstFragment();
        }else {
            return new SecondFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
