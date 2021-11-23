package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.AdditivesForPizza;
import com.vesolovskyi.dto.AdditivesForPizzaDto;
import org.springframework.stereotype.Component;

@Component
public class AdditivesForPizzaMapper extends AbstractMapper<AdditivesForPizza, AdditivesForPizzaDto>{
    @Override
    public AdditivesForPizzaDto mapObjectToDto(AdditivesForPizza additivesForPizza) {
        if (additivesForPizza == null) return null;

        AdditivesForPizzaDto.AdditivesForPizzaDtoBuilder additivesForPizzaDtoBuilder = AdditivesForPizzaDto.builder();
        additivesForPizzaDtoBuilder.id(additivesForPizza.getId());
        additivesForPizzaDtoBuilder.name(additivesForPizza.getName());
        additivesForPizzaDtoBuilder.callories(additivesForPizza.getCallories());
        additivesForPizzaDtoBuilder.price(additivesForPizza.getPrice());

        return additivesForPizzaDtoBuilder.build();
    }
}
