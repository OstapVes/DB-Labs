package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.DeliveryDaoImpl;
import com.vesolovskyi.model.entities.DeliveryEntity;
import com.vesolovskyi.model.service.Service;

public class DeliveryServiceImpl extends AbstractService<DeliveryEntity,Integer> implements Service<DeliveryEntity, Integer> {
    public DeliveryServiceImpl(){ super(new DeliveryDaoImpl());
    }
}
