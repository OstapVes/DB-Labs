package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.PizzaComposition;
import com.vesolovskyi.dto.PizzaCompositionDto;
import org.springframework.stereotype.Component;

@Component
public class PizzaCompositionMapper extends AbstractMapper<PizzaComposition, PizzaCompositionDto>{
    @Override
    public PizzaCompositionDto mapObjectToDto(PizzaComposition pizzaComposition) {
        if (pizzaComposition == null) return null;

        PizzaCompositionDto.PizzaCompositionDtoBuilder pizzaCompositionDtoBuilder = PizzaCompositionDto.builder();
        pizzaCompositionDtoBuilder.id(pizzaComposition.getId());
        pizzaCompositionDtoBuilder.name(pizzaComposition.getName());

        return pizzaCompositionDtoBuilder.build();
    }
}
