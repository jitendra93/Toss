package com.inventoryapp.toss.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.inventoryapp.toss.R
import com.inventoryapp.toss.model.Device

/*
 * Created by fRe@k(Gaurav Singh) on 9/5/2017.
 */

internal class DeviceListAdapter : RecyclerView.Adapter<DeviceViewHolder>() {

    var deviceList: List<Device>? = null
        set(deviceList) {
            field = deviceList
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeviceViewHolder {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_device_list_item, parent, false)
        return DeviceViewHolder(view)
    }

    override fun onBindViewHolder(holder: DeviceViewHolder, position: Int) {
        holder.bindData(deviceList!![position])
    }

    override fun getItemCount(): Int {

        if (deviceList == null) {
            return 0
        }
        return deviceList!!.size
    }
}
