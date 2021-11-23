package com.vesolovskyi.controller;

import com.vesolovskyi.domain.Address;
import com.vesolovskyi.dto.AddressDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.AddressMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/address")
@RestController
@AllArgsConstructor
public class AddressController extends AbstractController<Address, AddressDto, Integer> {
    private final AddressService addressService;
    private final AddressMapper addressMapper;


    @Override
    protected AbstractService<Address, Integer> getService() {
        return addressService;
    }

    @Override
    protected AbstractMapper<Address, AddressDto> getMapper() {
        return addressMapper;
    }
}