package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.SaladDaoImpl;
import com.vesolovskyi.model.entities.SaladEntity;
import com.vesolovskyi.model.service.Service;

public class SaladServiceImpl extends AbstractService<SaladEntity,Integer> implements Service<SaladEntity, Integer> {
    public SaladServiceImpl(){ super(new SaladDaoImpl());
    }
}