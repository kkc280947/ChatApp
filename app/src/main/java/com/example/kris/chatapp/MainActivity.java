package com.example.kris.chatapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    MainScreenAdapter mainScreenAdapter;
    TabLayout tabLayout;
    Toolbar mainToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        initView();
        initTabs();
    }

    private void initTabs() {

        mainScreenAdapter=new MainScreenAdapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(mainScreenAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initView() {
        viewPager=(ViewPager)findViewById(R.id.pager);
        tabLayout=(TabLayout)findViewById(R.id.tlTab);
        mainToolbar=(Toolbar)findViewById(R.id.tbTool);

        setSupportActionBar(mainToolbar);

    }
}
