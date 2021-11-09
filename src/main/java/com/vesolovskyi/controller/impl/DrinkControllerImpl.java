package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.DrinkEntity;
import com.vesolovskyi.model.service.impl.DrinkServiceImpl;

public class DrinkControllerImpl extends AbstractController<DrinkEntity,Integer> implements Controller<DrinkEntity, Integer> {
    public DrinkControllerImpl(){
        super(new DrinkServiceImpl());
    }
}
