package com.inventoryapp.toss.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.inventoryapp.toss.model.Device;

import java.util.List;

/*
 * Created by fRe@k(Gaurav Singh) on 9/7/2017.
 */

/**
 * A {@link FragmentStatePagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class DeviceDetailPagerAdapter extends FragmentStatePagerAdapter {

    private List<Device> deviceList;

    public DeviceDetailPagerAdapter(FragmentManager fm, List<Device> deviceList) {
        super(fm);
        this.deviceList = deviceList;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return DeviceDetailPageFragment.newInstance(deviceList.get(position));
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return deviceList.size();
    }
}
