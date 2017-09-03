package com.inventoryapp.toss.core.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Jitendra Alekar on 9/3/2017.
 */


public class User extends RealmObject {
    public static final String USER_ID = "userId";
    public static final String PIN = "pin";
    public static final String NAME = "name";
    public static final String SUPER_USER = "superUser";
    public static final String ACTIVE = "active";

    @PrimaryKey
    @SerializedName("userId")
    private String userId;
    @SerializedName("pin")
    private String pin;
    @SerializedName("name")
    private String name;
    @SerializedName("superUser")
    private boolean superUser;
    @SerializedName("active")
    private boolean active;

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPin() {
        return this.pin;
    }

    public User setPin(String pin) {
        this.pin = pin;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public boolean getSuperUser() {
        return this.superUser;
    }

    public User setSuperUser(boolean superUser) {
        this.superUser = superUser;
        return this;
    }

    public boolean getActive() {
        return this.active;
    }

    public User setActive(boolean active) {
        this.active = active;
        return this;
    }
}

