package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.Address;
import com.vesolovskyi.dto.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper extends AbstractMapper<Address, AddressDto>{
    @Override
    public AddressDto mapObjectToDto(Address address) {
        if (address == null) return null;

        AddressDto.AddressDtoBuilder addressDtoBuilder = AddressDto.builder();
        addressDtoBuilder.id(address.getId());
        addressDtoBuilder.name(address.getName());

        return addressDtoBuilder.build();
    }
}
