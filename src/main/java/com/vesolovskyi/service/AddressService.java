package com.vesolovskyi.service;

import com.vesolovskyi.domain.Address;
import com.vesolovskyi.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class AddressService extends AbstractService<Address, Integer> {
    public AddressRepository addressRepository;

    @Override
    protected JpaRepository<Address, Integer> getRepository() {
        return addressRepository;
    }
}

