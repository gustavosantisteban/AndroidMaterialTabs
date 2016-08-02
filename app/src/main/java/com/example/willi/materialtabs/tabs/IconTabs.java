package com.example.willi.materialtabs.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.willi.materialtabs.R;
import com.example.willi.materialtabs.adapters.IconTabsAdapter;
import com.example.willi.materialtabs.adapters.TextTabsAdapter;
import com.example.willi.materialtabs.fragments.FragmentFive;
import com.example.willi.materialtabs.fragments.FragmentFour;
import com.example.willi.materialtabs.fragments.FragmentSix;
import com.example.willi.materialtabs.fragments.FragmentThree;
import com.example.willi.materialtabs.fragments.FragmentTwo;
import com.example.willi.materialtabs.fragments.FragmetOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willi on 1/8/2016.
 */
public class IconTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private ViewPager viewpager;
    private IconTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icons_tabs);

        initialise();

        prepareDataResource();

        adapter = new IconTabsAdapter(getSupportFragmentManager(), fragmentList);
        viewpager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewpager);

        setTabIconos();
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Ejemplo Icons Tabs");

        viewpager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }

    private void prepareDataResource() {

        addData(new FragmetOne());
        addData(new FragmentTwo());
        addData(new FragmentThree());
        addData(new FragmentFour());
        addData(new FragmentFive());
        addData(new FragmentSix());

    }
    private void setTabIconos() {
        tabLayout.getTabAt(0).setIcon(R.drawable.facebook_logo);
        tabLayout.getTabAt(1).setIcon(R.drawable.linkedin_logo);
        tabLayout.getTabAt(2).setIcon(R.drawable.twitter_logo);
        tabLayout.getTabAt(3).setIcon(R.drawable.spotify_logo);
        tabLayout.getTabAt(4).setIcon(R.drawable.youtube_logo);
        tabLayout.getTabAt(5).setIcon(R.drawable.whatsapp_logo);
    }

    private void addData(Fragment fragment) {
        fragmentList.add(fragment);
    }
}