package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.AddressEntity;
import com.vesolovskyi.model.service.impl.AddressServiceImpl;

public class AddressControllerImpl extends AbstractController<AddressEntity, Integer> implements Controller<AddressEntity, Integer> {
    public AddressControllerImpl(){super(new AddressServiceImpl());}
}
