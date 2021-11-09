package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.DeliveryHasCourierDaoImpl;
import com.vesolovskyi.model.entities.DeliveryHasCourierEntity;
import com.vesolovskyi.model.service.Service;

public class DeliveryHasCourierServiceImpl extends AbstractService<DeliveryHasCourierEntity,Integer> implements Service<DeliveryHasCourierEntity, Integer> {
    public DeliveryHasCourierServiceImpl(){ super(new DeliveryHasCourierDaoImpl());
    }
}
