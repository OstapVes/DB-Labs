package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.Client;
import com.vesolovskyi.dto.ClientDto;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper extends AbstractMapper<Client, ClientDto>{
    @Override
    public ClientDto mapObjectToDto(Client client) {
        if (client == null) return null;

        ClientDto.ClientDtoBuilder clientDtoBuilder = ClientDto.builder();
        clientDtoBuilder.id(client.getId());
        clientDtoBuilder.name(client.getName());
        clientDtoBuilder.telNumber(client.getTelNumber());
        clientDtoBuilder.address(client.getAddress());
        clientDtoBuilder.paymentForDelivery(client.getPaymentForDelivery());

        return clientDtoBuilder.build();
    }
}
