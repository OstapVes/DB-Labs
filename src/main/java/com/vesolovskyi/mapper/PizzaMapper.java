package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.Delivery;
import com.vesolovskyi.domain.Pizza;
import com.vesolovskyi.dto.DeliveryDto;
import com.vesolovskyi.dto.PizzaDto;
import org.springframework.stereotype.Component;

@Component
public class PizzaMapper extends AbstractMapper<Pizza, PizzaDto>{
    @Override
    public PizzaDto mapObjectToDto(Pizza pizza) {
        if (pizza == null) return null;

        PizzaDto.PizzaDtoBuilder pizzaDtoBuilder = PizzaDto.builder();
        pizzaDtoBuilder.id(pizza.getId());
        pizzaDtoBuilder.name(pizza.getName());
        pizzaDtoBuilder.price(pizza.getPrice());
        pizzaDtoBuilder.callories(pizza.getCallories());
        pizzaDtoBuilder.weight(pizza.getWeight());
        pizzaDtoBuilder.size(pizza.getSize());

        return pizzaDtoBuilder.build();
    }
}
