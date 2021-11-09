package com.vesolovskyi.model.dao.IMPL;

import com.vesolovskyi.model.entities.PizzaEntity;

public class PizzaDaoImpl extends AbstractDaoImpl<PizzaEntity, Integer> {
    public PizzaDaoImpl() {
        super(PizzaEntity.class);
    }
}
