package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.CourierDaoImpl;
import com.vesolovskyi.model.entities.CourierEntity;
import com.vesolovskyi.model.service.Service;

public class CourierServiceImpl extends AbstractService<CourierEntity,Integer> implements Service<CourierEntity, Integer> {
    public CourierServiceImpl(){ super(new CourierDaoImpl());
    }
}