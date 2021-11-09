package com.vesolovskyi.model.service.impl;

import com.vesolovskyi.model.dao.IMPL.PizzaCompositionDaoImpl;
import com.vesolovskyi.model.entities.PizzaCompositionEntity;
import com.vesolovskyi.model.service.Service;

public class PizzaCompositionServiceImpl extends AbstractService<PizzaCompositionEntity,Integer> implements Service<PizzaCompositionEntity, Integer> {
    public PizzaCompositionServiceImpl(){ super(new PizzaCompositionDaoImpl());
    }
}