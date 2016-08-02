package com.example.willi.materialtabs.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.willi.materialtabs.R;
import com.example.willi.materialtabs.adapters.CustomTabsAdapter;
import com.example.willi.materialtabs.adapters.TextTabsAdapter;
import com.example.willi.materialtabs.fragments.FragmentThree;
import com.example.willi.materialtabs.fragments.FragmentTwo;
import com.example.willi.materialtabs.fragments.FragmetOne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willi on 2/8/2016.
 */
public class CustomViewTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> tituloList = new ArrayList<>();

    private ViewPager viewpager;
    private CustomTabsAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);

        initialise();

        prepareDataResource();

        adapter = new CustomTabsAdapter(getSupportFragmentManager(),fragmentList, tituloList);
        viewpager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewpager);

        setCustomViewForTabs();
    }

    private void initialise() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Ejemplo CustomView Tabs");

        viewpager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
    }

    private void prepareDataResource() {

        addData(new FragmetOne(), "UNO");
        addData(new FragmentTwo(), "DOS");
        addData(new FragmentThree(), "TRES");

    }

    private void addData(Fragment fragment, String titulo) {
        fragmentList.add(fragment);
        tituloList.add(titulo);
    }

    private void setCustomViewForTabs() {
        setCustomViewForTab(0, "JUEGOS", "TAB UNO");
        setCustomViewForTab(1, "CHAT", "TAB DOS");
        setCustomViewForTab(2, "PROFILE", "TAB TRES");
    }

    public void setCustomViewForTab(int position, String titulo, String subtitulo){
        LinearLayout tabView = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.tab_item, null);

        TextView textTitulo = (TextView) tabView.findViewById(R.id.tabTextTitulo);
        textTitulo.setText(titulo);

        TextView textsubTitulo = (TextView) tabView.findViewById(R.id.tabTextSubTitulo);
        textsubTitulo.setText(subtitulo);

        tabLayout.getTabAt(position).setCustomView(tabView);
    }
}
