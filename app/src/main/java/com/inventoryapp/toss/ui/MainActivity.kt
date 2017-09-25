package com.inventoryapp.toss.ui

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.inventoryapp.toss.R
import com.inventoryapp.toss.model.Device

/*
 * Created by fRe@k(Gaurav Singh) on 9/5/2017
 */

class MainActivity : AppCompatActivity(), DeviceListAdapter.OnItemClickListener, ValueEventListener {

    private val mDatabaseReference = FirebaseDatabase.getInstance().reference
    private val mDeviceDatabaseReference = mDatabaseReference.child("devices")
    private var deviceListAdapter: DeviceListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val fab: FloatingActionButton = findViewById(R.id.fab_main_activity)
        fab.setOnClickListener { click ->
            val intent = LoginActivity.getLoginIntent(this)
            startActivityForResult(intent, 123)
        }
        viewInitialisation()
    }

    override fun onDataChange(dataSnapshot: DataSnapshot) {
        val devices = dataSnapshot.children.map { it.getValue(Device::class.java)!! }
        deviceListAdapter!!.deviceList = devices
    }

    override fun onCancelled(databaseError: DatabaseError) {
        Log.e("Gaurav", databaseError.message)
    }

    override fun onStart() {
        super.onStart()

        mDeviceDatabaseReference.addValueEventListener(this)
    }

    override fun onStop() {
        super.onStop()

        mDeviceDatabaseReference.removeEventListener(this)
    }


    override fun onItemClick(position: Int) {


        startActivity(DeviceDetailActivity.getDeviceDetailActivityIntent(
                this,
                deviceListAdapter!!.deviceList, position))
    }

    private fun viewInitialisation() {
        val recyclerView = findViewById<RecyclerView>(R.id.rv_device_list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        deviceListAdapter = DeviceListAdapter(this)
        recyclerView.adapter = deviceListAdapter
    }
}
