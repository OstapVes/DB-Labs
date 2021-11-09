package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.DrinkDaoImpl;
import com.vesolovskyi.model.entities.DrinkEntity;
import com.vesolovskyi.model.service.Service;

public class DrinkServiceImpl extends AbstractService<DrinkEntity,Integer> implements Service<DrinkEntity, Integer> {
    public DrinkServiceImpl(){ super(new DrinkDaoImpl());
    }
}
