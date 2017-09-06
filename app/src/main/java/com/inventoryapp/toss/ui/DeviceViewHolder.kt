package com.inventoryapp.toss.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.inventoryapp.toss.R
import com.inventoryapp.toss.model.Device
import com.squareup.picasso.Picasso

/*
 * Created by fRe@k(Gaurav Singh) on 9/5/2017.
 */

internal class DeviceViewHolder(itemView: View,
                                private val listener: DeviceListAdapter.OnItemClickListener) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener {

    private val deviceImage: ImageView = itemView.findViewById<ImageView>(R.id.iv_device_img)
    private val deviceName: TextView = itemView.findViewById<TextView>(R.id.tv_device_name)
    private val currentOwner: TextView = itemView.findViewById<TextView>(R.id.tv_current_owner)
    private val deviceOsVersion: TextView = itemView.findViewById<TextView>(R.id.tv_device_os_version)

    init {
        itemView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        listener.onItemClick(adapterPosition)
    }

    fun bindData(device: Device) {
        deviceName.text = device.deviceName
        currentOwner.text = device.currentOwnerId
        deviceOsVersion.text = device.osVersion
        Picasso.with(itemView.context).load(device.imgURL).into(deviceImage)
    }
}
