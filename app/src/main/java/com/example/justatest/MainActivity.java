package com.example.justatest;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNav;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  bottomNavigation();
//        initView(createList());
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        arrayList.add("tab 1");
//        arrayList.add("tab 2");
//        arrayList.add("tab 3");


        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter vpAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        vpAdapter.addFragment(new Fragment_1(), "Fibbonacci");
        vpAdapter.addFragment(new Fragment_2(), "Hebel Finder");
        vpAdapter.addFragment(new Fragment_3(), "Third");
        viewPager.setAdapter(vpAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_calculate_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_percent_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_outdoor_grill_24);


//        prepareViewPager(viewPager, arrayList);
//        tabLayout.addTab(tabLayout.newTab().setText(list.get(i)));

//        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), list.size()));
        //tabLayout.setupWithViewPager(viewPager);

    }

    private void prepareViewPager(ViewPager viewPager, ArrayList<String> arrayList) {
        ViewPagerAdapter vpAdapter = new ViewPagerAdapter(getSupportFragmentManager());


        for (int i = 0; i < arrayList.size(); i++) {
//            Bundle bundle = new Bundle();
            Fragment_1 fragment = new Fragment_1();
//            fragment.setArguments(bundle);
            vpAdapter.addFragment(fragment, arrayList.get(i));

            //fragment = new Fragment_1();

        }
        viewPager.setAdapter(vpAdapter);
    }


//    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
//            new BottomNavigationView.OnNavigationItemSelectedListener() {
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                    Fragment selectedFragment = null;
//                    switch (item.getItemId()) {
//                        case R.id.nav_drafts:
//                            selectedFragment = new Fragment_1();
//                            break;
//                        case R.id.nav_mood:
//                            selectedFragment = new Fragment_2();
//                            break;
//                        case R.id.nav_grill:
//                            selectedFragment = new Fragment_3();
//                            break;
//                    }
//                    getSupportFragmentManager()
//                            .beginTransaction()
//                            .replace(R.id.fragment_Container, selectedFragment)
//                            .commit();
//                    return true;
//
//                }
//            };

    private List<String> createList() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("tab 1");
        arrayList.add("tab 2");
        arrayList.add("tab 3");
        return arrayList;
    }

    public void initView(List<String> list) {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        for (int i = 0; i < list.size(); i++) {
            tabLayout.addTab(tabLayout.newTab().setText(list.get(i)));


        }


//        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), list.size()));
        tabLayout.setupWithViewPager(viewPager);
    }

//    public void bottomNavigation() {
//        bottomNav = findViewById(R.id.bottom_Navigation);
//        bottomNav.setOnNavigationItemSelectedListener(navListener);
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragment_Container, new Fragment_1())
//                .commit();
//    }
}