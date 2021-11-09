package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.ClientEntity;
import com.vesolovskyi.model.service.impl.ClientServiceImpl;

public class ClientControllerImpl extends AbstractController<ClientEntity, Integer> implements Controller<ClientEntity, Integer> {
    public ClientControllerImpl(){super(new ClientServiceImpl());}
}
