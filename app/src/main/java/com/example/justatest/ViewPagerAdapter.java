package com.example.justatest;

//import android.app.Fragment;
//import android.app.FragmentManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
ArrayList<String> arrayList = new ArrayList<>();
List<Fragment> fragmentList = new ArrayList<>();

public void addFragment( Fragment fragment, String title){
    arrayList.add(title);
    fragmentList.add(fragment);
}
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

//    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
//        super(fm, behavior);
//    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
//        switch (position%3) {
//            case 0:
//                return new Fragment_1();
//            case 1:
//                return new Fragment_2();
//            case 2:
//                return new Fragment_3();
//            default:
//                throw new IllegalArgumentException("Illegal position " + position);
//        }
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);
        return arrayList.get(position);
    }
}
