package com.inventoryapp.toss.network.firebase.service;


import android.support.annotation.NonNull;

import com.inventoryapp.toss.core.model.Device;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/*
 * Created by fRe@k on 9/3/2017.
 */

public interface DeviceService {

    @GET("")
    Flowable<List<Device>> fetchAll();

    @POST("")
    Flowable<Device> create(@NonNull @Body Device device);

    @PUT("")
    Flowable<Device> put(@NonNull @Body Device device);

    @PATCH("")
    Flowable<Device> patch(@NonNull @Body Device device);
}
