package com.example.tacademy.sampleviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    ViewPager pager;
    MypagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager)findViewById(R.id.pager);

        mAdapter = new MypagerAdapter(); // Adapter 생성
        pager.setAdapter(mAdapter);

        initData();
    }

    private void initData(){
        for(int i = 0; i < 5; i++){
            mAdapter.add("item" + i);
        }
    }

}
