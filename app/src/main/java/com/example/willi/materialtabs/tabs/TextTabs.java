package com.example.willi.materialtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.willi.materialtabs.R;
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
public class TextTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> tituloList = new ArrayList<>();
    private ViewPager viewpager;
    private TextTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);

        initialise();
        
        prepareDataResource();

        adapter = new TextTabsAdapter(getSupportFragmentManager(),fragmentList, tituloList);
        viewpager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewpager);

        setTabsIconos();
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Ejemplo Tabs Simple");

        viewpager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }

    private void prepareDataResource() {

        addData(new FragmetOne(), "UNO");
        addData(new FragmentTwo(), "DOS");
        addData(new FragmentThree(), "TRE");

    }

    private void addData(Fragment fragment, String titulo) {
        fragmentList.add(fragment);
        tituloList.add(titulo);
    }

    private void setTabsIconos() {
        tabLayout.getTabAt(0).setIcon(R.drawable.facebook_logo);
        tabLayout.getTabAt(1).setIcon(R.drawable.whatsapp_logo);
        tabLayout.getTabAt(2).setIcon(R.drawable.twitter_logo);
    }
}
