package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.SaladEntity;
import com.vesolovskyi.model.service.impl.SaladServiceImpl;

public class SaladControllerImpl extends AbstractController<SaladEntity, Integer> implements Controller<SaladEntity, Integer> {
    public SaladControllerImpl(){super(new SaladServiceImpl());}
}