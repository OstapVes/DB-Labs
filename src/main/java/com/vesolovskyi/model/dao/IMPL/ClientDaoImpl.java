package com.vesolovskyi.model.dao.IMPL;

import com.vesolovskyi.model.entities.ClientEntity;

public class ClientDaoImpl extends AbstractDaoImpl<ClientEntity, Integer>  {
    public ClientDaoImpl() {
        super(ClientEntity.class);
    }
}
