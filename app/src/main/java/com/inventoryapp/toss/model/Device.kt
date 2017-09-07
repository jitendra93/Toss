package com.inventoryapp.toss.model

import android.os.Parcel
import android.os.Parcelable
import com.google.firebase.database.IgnoreExtraProperties

/*
 * Created by fRe@k(Gaurav Singh) on 9/5/2017.
 */
@IgnoreExtraProperties
class Device() : Parcelable {

    var id: String? = null
    var currentOwnerId: String? = null
    var deviceName: String? = null
    var imgURL: String? = null
    var osVersion: String? = null

    constructor(parcel: Parcel) : this() {
        id = parcel.readString()
        currentOwnerId = parcel.readString()
        deviceName = parcel.readString()
        imgURL = parcel.readString()
        osVersion = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(currentOwnerId)
        parcel.writeString(deviceName)
        parcel.writeString(imgURL)
        parcel.writeString(osVersion)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Device> {
        override fun createFromParcel(parcel: Parcel): Device {
            return Device(parcel)
        }

        override fun newArray(size: Int): Array<Device?> {
            return arrayOfNulls(size)
        }
    }
}
