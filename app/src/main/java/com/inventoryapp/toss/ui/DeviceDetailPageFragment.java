package com.inventoryapp.toss.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.inventoryapp.toss.R;
import com.inventoryapp.toss.model.Device;
import com.squareup.picasso.Picasso;

/*
 * Created by fRe@k(Gaurav Singh) on 9/7/2017.
 */

public class DeviceDetailPageFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String DEVICE = "device";

    public DeviceDetailPageFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static DeviceDetailPageFragment newInstance(Device device) {
        DeviceDetailPageFragment fragment = new DeviceDetailPageFragment();
        Bundle args = new Bundle();
        args.putParcelable(DEVICE, device);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_device_detail, container, false);

        ImageView deviceImage = rootView.findViewById(R.id.iv_device_detail_device_img);
        TextView deviceName = rootView.findViewById(R.id.tv_device_detail_device_name);
        TextView currentOwner = rootView.findViewById(R.id.tv_device_detail_current_owner);
        TextView deviceOsVersion = rootView.findViewById(R.id.tv_device_os_version);

        Device device = getArguments().getParcelable(DEVICE);

        if (device != null) {
            deviceName.setText(device.getDeviceName());
            currentOwner.setText(device.getCurrentOwnerId());
            deviceOsVersion.setText(device.getOsVersion());
            Picasso.with(rootView.getContext()).load(device.getImgURL()).into(deviceImage);
        }
        return rootView;
    }
}
