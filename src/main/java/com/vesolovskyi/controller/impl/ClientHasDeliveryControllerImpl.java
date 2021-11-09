package com.vesolovskyi.controller.impl;

import com.vesolovskyi.controller.Controller;
import com.vesolovskyi.model.entities.ClientHasDeliveryEntity;
import com.vesolovskyi.model.service.impl.ClientHasDeliveryServiceImpl;

public class ClientHasDeliveryControllerImpl extends AbstractController<ClientHasDeliveryEntity, Integer> implements Controller<ClientHasDeliveryEntity, Integer> {
    public ClientHasDeliveryControllerImpl(){super(new ClientHasDeliveryServiceImpl());}
}
