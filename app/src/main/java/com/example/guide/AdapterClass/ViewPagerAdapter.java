package com.example.guide.AdapterClass;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.guide.Fragments.AlertFrag;
import com.example.guide.Fragments.ClientFrag;
import com.example.guide.Fragments.CompletedDutiesFrag;
import com.example.guide.Fragments.Homefragment;
import com.example.guide.Fragments.PendingDutieFrag;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment temp=null;
        switch (position) {
            case 0:
                return new Homefragment();
            case 1:
                return new PendingDutieFrag();
            case 2:
                return new CompletedDutiesFrag();
            case 3:
                return new AlertFrag();
            case 4:
                return new ClientFrag();
        }
        return null;
    }
    @Override
    public int getCount() {
        return 5;
    }}