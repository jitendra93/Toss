package com.inventoryapp.toss.network;

import retrofit2.Retrofit;

/*
 * Created by fRe@k on 9/3/2017.
 */

public abstract class Server {

    protected Retrofit.Builder apiBuilder() {

        return new Retrofit.Builder().baseUrl(getBaseUrl());
    }

    public final <T> T buildApi(final Class<T> service) {
        return apiBuilder().build().create(service);
    }

    protected abstract String getBaseUrl();
}
