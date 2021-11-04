package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.AdditivesForPizzaEntity;
import com.vesolovskyi.model.entities.DeliveryEntity;
import com.vesolovskyi.model.service.impl.AdditivesForPizzaServiceImpl;
import com.vesolovskyi.model.service.impl.DeliveryServiceImpl;

public class AdditivesForPizzaControllerImpl extends AbstractController<AdditivesForPizzaEntity, Integer> implements Controller<AdditivesForPizzaEntity, Integer> {
    public AdditivesForPizzaControllerImpl(){super(new AdditivesForPizzaServiceImpl());}
}
