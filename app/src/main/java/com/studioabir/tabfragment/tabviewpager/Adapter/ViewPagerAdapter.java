package com.studioabir.tabfragment.tabviewpager.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> myfragmentlist = new ArrayList<>();
    private final List<String> myfragmenttitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return myfragmentlist.get(i);
    }

    @Override
    public int getCount() {
        return myfragmentlist.size();
    }

    public void addmyfragment(Fragment f, String title)
    {
        myfragmentlist.add(f);
        myfragmenttitle.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return myfragmenttitle.get(position);
    }
}
