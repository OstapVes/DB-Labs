package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.CityEntity;
import com.vesolovskyi.model.service.impl.CityServiceImpl;

public class CityControllerImpl extends AbstractController<CityEntity, Integer> implements Controller<CityEntity, Integer> {
    public CityControllerImpl(){super(new CityServiceImpl());}
}
