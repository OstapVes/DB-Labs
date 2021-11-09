package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.ClientDaoImpl;
import com.vesolovskyi.model.entities.ClientEntity;
import com.vesolovskyi.model.service.Service;

public class ClientServiceImpl extends AbstractService<ClientEntity,Integer> implements Service<ClientEntity, Integer> {
    public ClientServiceImpl(){ super(new ClientDaoImpl());
    }
}
