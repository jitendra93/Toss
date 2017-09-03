package com.inventoryapp.toss.core.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by Jitendra Alekar on 9/3/2017.
 */


public class User extends RealmObject {
    public static final String T_C_S_ID = "tCS_id";
    public static final String PIN = "pin";
    public static final String NAME = "name";
    public static final String SUPER_USER = "superUser";
    public static final String ACTIVE = "active";

    @SerializedName("TCS_id")
    private String tCS_id;
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

    public String getTCS_id() {
        return this.tCS_id;
    }

    public User setTCS_id(String tCS_id) {
        this.tCS_id = tCS_id;
        return this;
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

