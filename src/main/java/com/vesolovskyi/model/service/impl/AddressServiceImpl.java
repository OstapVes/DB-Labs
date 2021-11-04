package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.AddressDaoImpl;
import com.vesolovskyi.model.entities.AddressEntity;
import com.vesolovskyi.model.service.Service;

public class AddressServiceImpl extends AbstractService<AddressEntity,Integer> implements Service<AddressEntity, Integer> {
    public AddressServiceImpl(){ super(new AddressDaoImpl());
    }
}
