package com.example.no0ne.swipetab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by no0ne on 3/15/17.
 */
public class MyAdapter extends FragmentStatePagerAdapter {


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;

        if (position == 0) {
            fragment = new FragmentA();
        } else if (position == 1) {
            fragment = new FragmentB();
        } else {
            fragment = new FragmentC();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Tab 1";
        } else if (position == 1) {
            return "Tab 2";
        } else {
            return "Tab 3";
        }
    }
}
