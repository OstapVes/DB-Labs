package com.vesolovskyi.controller;

import com.vesolovskyi.domain.Client;
import com.vesolovskyi.dto.ClientDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.ClientMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/client")
@RestController
@AllArgsConstructor
public class ClientController extends AbstractController<Client, ClientDto, Integer> {
    private final ClientService clientService;
    private final ClientMapper clientMapper;


    @Override
    protected AbstractService<Client, Integer> getService() {
        return clientService;
    }

    @Override
    protected AbstractMapper<Client, ClientDto> getMapper() {
        return clientMapper;
    }
}