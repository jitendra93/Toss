package com.inventoryapp.toss.model

import com.google.firebase.database.IgnoreExtraProperties

/*
 * Created by fRe@k(Gaurav Singh) on 9/5/2017.
 */
@IgnoreExtraProperties
class Device {

    var id: String? = null
    var currentOwnerId: String? = null
    var deviceName: String? = null
    var imgURL: String? = null
    var osVersion: String? = null
}
