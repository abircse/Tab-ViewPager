package com.studioabir.tabfragment.tabviewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.studioabir.tabfragment.tabviewpager.Adapter.ViewPagerAdapter;
import com.studioabir.tabfragment.tabviewpager.fragments.fragment_four;
import com.studioabir.tabfragment.tabviewpager.fragments.fragment_one;
import com.studioabir.tabfragment.tabviewpager.fragments.fragment_three;
import com.studioabir.tabfragment.tabviewpager.fragments.fragment_two;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.mytabs);
        viewPager = findViewById(R.id.myviewpager);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }



    void setUpViewPager(ViewPager vp)
    {
        ViewPagerAdapter vpa = new ViewPagerAdapter(getSupportFragmentManager());
        vpa.addmyfragment(new fragment_one(), "FRAGMENT ONE");
        vpa.addmyfragment(new fragment_two(), "FRAGMENT TWO");
        vpa.addmyfragment(new fragment_three(), "FRAGMENT THREE");
        vpa.addmyfragment(new fragment_four(), "FRAGMENT FOUR");
        vp.setAdapter(vpa);

    }


}
