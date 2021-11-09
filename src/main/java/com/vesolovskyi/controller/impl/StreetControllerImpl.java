package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.StreetEntity;
import com.vesolovskyi.model.service.impl.StreetServiceImpl;

public class StreetControllerImpl extends AbstractController<StreetEntity, Integer> implements Controller<StreetEntity, Integer> {
    public StreetControllerImpl(){super(new StreetServiceImpl());}
}