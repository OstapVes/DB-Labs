package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.DeliveryEntity;
import com.vesolovskyi.model.service.impl.DeliveryServiceImpl;

public class DeliveryControllerImpl extends AbstractController<DeliveryEntity, Integer> implements Controller<DeliveryEntity, Integer> {
    public DeliveryControllerImpl(){super(new DeliveryServiceImpl());}
}
