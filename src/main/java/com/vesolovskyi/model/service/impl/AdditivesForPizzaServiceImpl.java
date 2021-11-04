package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.AdditivesForPizzaDaoImpl;
import com.vesolovskyi.model.entities.AdditivesForPizzaEntity;
import com.vesolovskyi.model.service.Service;

public class AdditivesForPizzaServiceImpl extends AbstractService<AdditivesForPizzaEntity,Integer> implements Service<AdditivesForPizzaEntity, Integer> {
    public AdditivesForPizzaServiceImpl(){ super(new AdditivesForPizzaDaoImpl());
    }
}
