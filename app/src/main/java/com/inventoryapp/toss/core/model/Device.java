package com.inventoryapp.toss.core.model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by Jitendra Alekar on 9/3/2017.
 */


public class Device extends RealmObject {
    public static final String DEVICE_ID = "deviceId";
    public static final String CURRENT_OWNER = "currentOwner";
    public static final String DEVICE_NAME = "deviceName";
    public static final String OS_VERSION = "osVersion";
    public static final String IMG_U_R_L = "imgURL";

    @SerializedName("deviceId")
    private String deviceId;
    @SerializedName("currentOwner")
    private String currentOwner;
    @SerializedName("deviceName")
    private String deviceName;
    @SerializedName("osVersion")
    private String osVersion;
    @SerializedName("imgURL")
    private String imgURL;

    public Device() {
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public Device setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public String getCurrentOwner() {
        return this.currentOwner;
    }

    public Device setCurrentOwner(String currentOwner) {
        this.currentOwner = currentOwner;
        return this;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public Device setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public Device setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getImgURL() {
        return this.imgURL;
    }

    public Device setImgURL(String imgURL) {
        this.imgURL = imgURL;
        return this;
    }
}

