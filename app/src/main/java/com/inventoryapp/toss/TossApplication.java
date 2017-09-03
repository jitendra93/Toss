package com.inventoryapp.toss;

import android.app.Application;

import com.squareup.picasso.Picasso;

import io.realm.Realm;

/**
 * Created by Jitendra Alekar on 9/3/2017.
 */

public class TossApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        setPicassoSingleton();
    }

    private void setPicassoSingleton() {
        Picasso picasso = new Picasso.Builder(this).build();
        Picasso.setSingletonInstance(picasso);
    }
}
