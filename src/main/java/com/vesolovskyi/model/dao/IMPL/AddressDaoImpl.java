package com.vesolovskyi.model.dao.IMPL;

import com.vesolovskyi.model.entities.AddressEntity;

public class AddressDaoImpl extends AbstractDaoImpl<AddressEntity, Integer>  {
    public AddressDaoImpl() {
        super(AddressEntity.class);
    }
}
