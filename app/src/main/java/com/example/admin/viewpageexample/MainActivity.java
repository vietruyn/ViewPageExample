package com.example.admin.viewpageexample;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.admin.viewpageexample.SlidingTab.SlidingTabLayout;
import com.example.admin.viewpageexample.adapter.ViewpagerAdapter;


public class MainActivity extends FragmentActivity
{public MainActivity() {

}
    ViewPager viewPager;
    SlidingTabLayout tabs;
    int[] icons = {
            R.drawable.first_tab,
            R.drawable.second_tab,
            R.drawable.third_tab,
            R.drawable.fourth_tab,
            R.drawable.fifth_tab
    };
    CharSequence[] titles = {
            "News",
            "Request",
            "Messenger",
            "Notification",
            "More"
    };
    ViewpagerAdapter pagerAdapter;

    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // These two lines not needed,
        // just to get the look of facebook (changing background color & hiding the icon)
        ActionBar actionBar = getActionBar();

//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3b5998")));
//        getActionBar().setIcon(
//                new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabs = (SlidingTabLayout) findViewById(R.id.tabBar);
        pagerAdapter = new ViewpagerAdapter(getSupportFragmentManager(), icons);


        viewPager.setAdapter(pagerAdapter);
        tabs.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        tabs.setDistributeEvenly(true);
//        tabs.setCustomTabView(R.layout.custom_tabs_layout, 0);
        tabs.setViewPager(viewPager);

    }




}
