package com.inventoryapp.toss

import android.app.Application

import com.squareup.picasso.Picasso

/*
 * Created by Jitendra Alekar on 9/3/2017.
 */

class TossApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setPicassoSingleton()
    }

    private fun setPicassoSingleton() {
        val picasso = Picasso.Builder(this).build()
        Picasso.setSingletonInstance(picasso)
    }
}
