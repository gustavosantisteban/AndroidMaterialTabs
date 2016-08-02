package com.example.willi.materialtabs.app;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

import com.example.willi.materialtabs.R;
import com.example.willi.materialtabs.tabs.CustomViewTabs;
import com.example.willi.materialtabs.tabs.IconTabs;
import com.example.willi.materialtabs.tabs.ScrollTabs;
import com.example.willi.materialtabs.tabs.TextTabs;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnSimpleTabs, btnScrollableTabs, btnIconTabs, btnCustomIconTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
        btnIconTabs = (Button) findViewById(R.id.btnIconTabs);
        btnScrollableTabs = (Button) findViewById(R.id.btnScrollableTabs);
        btnCustomIconTabs = (Button) findViewById(R.id.btnCustomIconTabs);

        btnSimpleTabs.setOnClickListener(this);
        btnScrollableTabs.setOnClickListener(this);
        btnIconTabs.setOnClickListener(this);
        btnCustomIconTabs.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent i = null;
        switch (view.getId()) {
            case R.id.btnSimpleTabs:
                i = new Intent(MainActivity.this, TextTabs.class);
                break;
            case R.id.btnIconTabs:
                i = new Intent(MainActivity.this, IconTabs.class);
                break;
            case R.id.btnScrollableTabs:
                i = new Intent(MainActivity.this, ScrollTabs.class);
                break;
            case R.id.btnCustomIconTabs:
                i = new Intent(MainActivity.this, CustomViewTabs.class);
                break;
        }
        startActivity(i);
    }
}
