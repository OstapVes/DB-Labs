package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.ClientHasDeliveryDaoImpl;
import com.vesolovskyi.model.entities.ClientHasDeliveryEntity;
import com.vesolovskyi.model.service.Service;

public class ClientHasDeliveryServiceImpl extends AbstractService<ClientHasDeliveryEntity,Integer> implements Service<ClientHasDeliveryEntity, Integer> {
    public ClientHasDeliveryServiceImpl(){ super(new ClientHasDeliveryDaoImpl());
    }
}