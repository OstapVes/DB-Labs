package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.PizzaCompositionEntity;
import com.vesolovskyi.model.service.impl.PizzaCompositionServiceImpl;

public class PizzaCompositionControllerImpl extends AbstractController<PizzaCompositionEntity, Integer> implements Controller<PizzaCompositionEntity, Integer> {
    public PizzaCompositionControllerImpl(){super(new PizzaCompositionServiceImpl());}
}