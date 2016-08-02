package com.example.willi.materialtabs.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by willi on 1/8/2016.
 */
public class IconTabsAdapter  extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    public IconTabsAdapter(FragmentManager fm, List<Fragment> fragmentsList) {
        super(fm);
        this.fragmentList = fragmentsList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

}