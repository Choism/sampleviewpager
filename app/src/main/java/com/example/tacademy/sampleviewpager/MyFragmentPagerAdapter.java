package com.example.tacademy.sampleviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016-07-25.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    List<String> items = new ArrayList<>();

    public void add(String text) {
        items.add(text);
        notifyDataSetChanged();
    }

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TextFragment.newInstance(items.get(position));
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
