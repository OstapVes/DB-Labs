package com.vesolovskyi.service;

import com.vesolovskyi.domain.Client;
import com.vesolovskyi.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class ClientService extends AbstractService<Client, Integer> {
    public ClientRepository clientRepository;

    @Override
    protected JpaRepository<Client, Integer> getRepository() {
        return clientRepository;
    }
}
