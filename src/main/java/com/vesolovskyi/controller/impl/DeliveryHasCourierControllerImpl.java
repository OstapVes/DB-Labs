package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.DeliveryHasCourierEntity;
import com.vesolovskyi.model.service.impl.DeliveryHasCourierServiceImpl;

public class DeliveryHasCourierControllerImpl extends AbstractController<DeliveryHasCourierEntity, Integer> implements Controller<DeliveryHasCourierEntity, Integer> {
    public DeliveryHasCourierControllerImpl(){super(new DeliveryHasCourierServiceImpl());}
}