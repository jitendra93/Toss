package com.inventoryapp.toss.core.blf;

import com.inventoryapp.toss.core.model.Device;
import com.inventoryapp.toss.core.model.User;
import com.inventoryapp.toss.core.usecase.FetchAllDevicesUseCase;
import com.inventoryapp.toss.core.usecase.FetchAllUsersUseCase;
import com.inventoryapp.toss.core.usecase.IssueDeviceUseCase;

import java.util.List;

/**
 * Created by Jitendra Alekar on 9/3/2017.
 */

public class UseCaseImplFactory {
    IssueDeviceUseCase issueDeviceUseCase;
    FetchAllDevicesUseCase fetchAllDevicesUseCase;
    FetchAllUsersUseCase fetchAllUsersUseCase;

    public UseCaseImplFactory() {
        this.issueDeviceUseCase = new IssueDeviceUseCaseImpl();
        this.fetchAllDevicesUseCase = new FetchAllDevicesUseCaseImpl();
        this.fetchAllUsersUseCase = new FetchAllUsersUseCaseImpl();
    }

    public Device issueDevice(Device device) {
        return this.issueDeviceUseCase.perform(device);
    }

    public List<Device> fetchAllDevices() {
        return fetchAllDevicesUseCase.perform(null);
    }

    public List<User> fetchAllUsers() {
        return fetchAllUsersUseCase.perform(null);
    }
}
