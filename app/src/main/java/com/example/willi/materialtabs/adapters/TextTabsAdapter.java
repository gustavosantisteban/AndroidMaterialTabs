package com.example.willi.materialtabs.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by willi on 1/8/2016.
 */
public class TextTabsAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;
    private List<String> tituloList;

    public TextTabsAdapter(FragmentManager fm, List<Fragment> fragmentsList, List<String> tituloList) {
        super(fm);
        this.fragmentList = fragmentsList;
        this.tituloList = tituloList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tituloList.get(position);
    }
}
