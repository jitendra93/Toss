package com.inventoryapp.toss.network.firebase;

import com.inventoryapp.toss.network.Server;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 * Created by fRe@k on 9/3/2017.
 */

public class FirebaseServer extends Server {

    @Override
    protected Retrofit.Builder apiBuilder() {
        return super.apiBuilder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create());
    }

    @Override
    protected String getBaseUrl() {
        return "https://toss-aadc6.firebaseio.com/";
    }
}
