package com.example.tacademy.sampleviewpager;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Tacademy on 2016-07-25.
 */
public class MypagerAdapter extends PagerAdapter {


List<String> items = new ArrayList<>();

    public void add(String text){
        items.add(text);
        notifyDataSetChanged();
    }

    public int getCount(){
        return items.size();
    }

    List<TextView> scrapped = new ArrayList<>(); // 새로 생성할 필요없이 재활용 하게 해줄려고 만들어줌

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
    TextView tv = null;
        if(scrapped.size() > 0){
            tv = scrapped.remove(0);
        }else{
            tv = (TextView) LayoutInflater.from(container.getContext()).inflate(android.R.layout.simple_list_item_1, container, false);
        }
        tv.setText(items.get(position));
        container.addView(tv);
        Log.i("MyPagerAdater", "position : " + position);
        return tv;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View)object;
        container.removeView(view);
        scrapped.add((TextView)view);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public float getPageWidth(int position) {
        return 0.5f;
    }
}