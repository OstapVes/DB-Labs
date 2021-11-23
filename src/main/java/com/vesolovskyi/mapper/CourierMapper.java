package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.Courier;
import com.vesolovskyi.dto.CourierDto;
import org.springframework.stereotype.Component;

@Component
public class CourierMapper extends AbstractMapper<Courier, CourierDto>{
    @Override
    public CourierDto mapObjectToDto(Courier courier) {
        if (courier == null) return null;

        CourierDto.CourierDtoBuilder courierDtoBuilder = CourierDto.builder();
        courierDtoBuilder.id(courier.getId());
        courierDtoBuilder.name(courier.getName());
        courierDtoBuilder.telNumber(courier.getTelNumber());
        courierDtoBuilder.location(courier.getLocation());
        courierDtoBuilder.transport(courier.getTransport());
        courierDtoBuilder.fulfilledTheOrder(courier.getFulfilledTheOrder());

        return courierDtoBuilder.build();
    }
}
