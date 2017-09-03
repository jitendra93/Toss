package com.inventoryapp.toss.network.firebase.service;

import android.support.annotation.NonNull;

import com.inventoryapp.toss.core.model.User;

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

public interface UserService {

    @GET("")
    Flowable<List<User>> fetchAll();

    @POST("")
    Flowable<User> post(@NonNull @Body User user);

    @PUT("")
    Flowable<User> put(@NonNull @Body User user);

    @PATCH("")
    Flowable<User> patch(@NonNull @Body User user);
}
