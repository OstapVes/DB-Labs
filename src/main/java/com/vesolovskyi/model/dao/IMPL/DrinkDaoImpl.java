package com.vesolovskyi.model.dao.IMPL;

import com.vesolovskyi.model.entities.DrinkEntity;

public class DrinkDaoImpl extends AbstractDaoImpl<DrinkEntity, Integer>  {
    public DrinkDaoImpl() {
        super(DrinkEntity.class);
    }
}