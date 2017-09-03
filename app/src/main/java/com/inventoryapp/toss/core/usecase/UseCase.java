package com.inventoryapp.toss.core.usecase;

/**
 * Created by Jitendra Alekar on 9/3/2017.
 */

public interface UseCase<Inparam, Outparam> {
    Outparam perform(Inparam inparam);
}
