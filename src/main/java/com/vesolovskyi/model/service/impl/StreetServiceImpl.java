package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.StreetDaoImpl;
import com.vesolovskyi.model.entities.StreetEntity;
import com.vesolovskyi.model.service.Service;

public class StreetServiceImpl extends AbstractService<StreetEntity,Integer> implements Service<StreetEntity, Integer> {
    public StreetServiceImpl(){ super(new StreetDaoImpl());
    }
}