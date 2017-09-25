package com.inventoryapp.toss.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.inventoryapp.toss.R;
import com.inventoryapp.toss.model.Device;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Created by fRe@k(Gaurav Singh) on 9/7/2017.
 */

public class DeviceDetailActivity extends AppCompatActivity {

    private static final String DEVICE_LIST = "deviceList";
    private static final String POSITION = "position";

    public static Intent getDeviceDetailActivityIntent(Context context,
                                                       List<Device> devices,
                                                       int position) {

        Device array[] = devices.toArray(new Device[devices.size()]);
        Intent intent = new Intent(context, DeviceDetailActivity.class);
        intent.putParcelableArrayListExtra(DEVICE_LIST, new ArrayList<Parcelable>(Arrays.asList(array)));
        intent.putExtra(POSITION, position);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<Device> devices = getIntent().getParcelableArrayListExtra(DEVICE_LIST);
        int currentItem = getIntent().getIntExtra(POSITION, 0);

        initViewPager(devices, currentItem);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    private void initViewPager(List<Device> devices, int currentItem) {
        DeviceDetailPagerAdapter mDeviceDetailPagerAdapter =
                new DeviceDetailPagerAdapter(getSupportFragmentManager(), devices);

        ViewPager mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mDeviceDetailPagerAdapter);
        mViewPager.setCurrentItem(currentItem);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_device_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        this.finish();


        overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
    }
}
