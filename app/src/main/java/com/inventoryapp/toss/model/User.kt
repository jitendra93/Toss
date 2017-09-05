package com.inventoryapp.toss.model

/*
 * Created by fRe@k(Gaurav Singh) on 9/5/2017
 */

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
class User {

    var id: String? = null
    var name: String? = null
    var pin: String? = null
    var isSuperUser: Boolean = false
}
