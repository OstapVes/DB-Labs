package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.Delivery;
import com.vesolovskyi.domain.Salad;
import com.vesolovskyi.dto.DeliveryDto;
import com.vesolovskyi.dto.SaladDto;
import org.springframework.stereotype.Component;

@Component
public class SaladMapper extends AbstractMapper<Salad, SaladDto>{
    @Override
    public SaladDto mapObjectToDto(Salad salad) {
        if (salad == null) return null;

        SaladDto.SaladDtoBuilder saladDtoBuilder = SaladDto.builder();
        saladDtoBuilder.id(salad.getId());
        saladDtoBuilder.name(salad.getName());
        saladDtoBuilder.price(salad.getPrice());
        saladDtoBuilder.composition(salad.getComposition());
        saladDtoBuilder.weight(salad.getWeight());
        saladDtoBuilder.callories(salad.getCallories());

        return saladDtoBuilder.build();
    }
}
