package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.CourierEntity;
import com.vesolovskyi.model.service.impl.CourierServiceImpl;

public class CourierControllerImpl extends AbstractController<CourierEntity, Integer> implements Controller<CourierEntity, Integer> {
    public CourierControllerImpl(){super(new CourierServiceImpl());}
}
