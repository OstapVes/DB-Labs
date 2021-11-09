package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.PizzaDaoImpl;
import com.vesolovskyi.model.entities.PizzaEntity;
import com.vesolovskyi.model.service.Service;

public class PizzaServiceImpl extends AbstractService<PizzaEntity,Integer> implements Service<PizzaEntity, Integer> {
    public PizzaServiceImpl(){ super(new PizzaDaoImpl());
    }
}
