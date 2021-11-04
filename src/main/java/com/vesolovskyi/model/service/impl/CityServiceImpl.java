package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.CityDaoImpl;
import com.vesolovskyi.model.entities.CityEntity;
import com.vesolovskyi.model.service.Service;

public class CityServiceImpl extends AbstractService<CityEntity,Integer> implements Service<CityEntity, Integer> {
    public CityServiceImpl(){ super(new CityDaoImpl());
    }
}
