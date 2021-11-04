package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.PizzaEntity;
import com.vesolovskyi.model.service.impl.PizzaServiceImpl;

public class PizzaControllerImpl extends AbstractController<PizzaEntity, Integer> implements Controller<PizzaEntity, Integer> {
    public PizzaControllerImpl(){super(new PizzaServiceImpl());}
}
