package com.example.kris.chatapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kris on 11/02/17.
 */
public class MainScreenAdapter extends FragmentPagerAdapter{
    int tabCount;

    public MainScreenAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new CallFragment();

            case 1: return new ChatFragment();

            case 2: return  new ContactFragment();

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0: return "Calls";

            case 1:return  "Chats";

            case 2: return  "Contacts";

            default:return null;
        }


    }
}
