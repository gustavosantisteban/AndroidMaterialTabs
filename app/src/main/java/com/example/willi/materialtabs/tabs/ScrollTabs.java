package com.example.willi.materialtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.willi.materialtabs.R;
import com.example.willi.materialtabs.adapters.ScrollTabsAdapter;
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
public class ScrollTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> tituloList = new ArrayList<>();
    private ViewPager viewpager;
    private ScrollTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tabs);

        initialise();
        
        prepareDataResource();

        adapter = new ScrollTabsAdapter(getSupportFragmentManager(),fragmentList, tituloList);
        viewpager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewpager);

    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Ejemplo Scroll Tabs");

        viewpager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }

    private void prepareDataResource() {

        addData(new FragmetOne(), "UNO");
        addData(new FragmentTwo(), "DOS");
        addData(new FragmentThree(), "TRES");
        addData(new FragmentFour(), "CUATRO");
        addData(new FragmentFive(), "CINCO");
        addData(new FragmentSix(), "SEIS");

        addData(new FragmetOne(), "UNO 1");
        addData(new FragmentTwo(), "DOS 2");
        addData(new FragmentThree(), "TRES 3");
        addData(new FragmentFour(), "CUATRO 4");
        addData(new FragmentFive(), "CINCO 5");
        addData(new FragmentSix(), "SEIS 6");

    }

    private void addData(Fragment fragment, String titulo) {
        fragmentList.add(fragment);
        tituloList.add(titulo);
    }

}
