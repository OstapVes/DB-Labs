package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.Delivery;
import com.vesolovskyi.domain.Drink;
import com.vesolovskyi.dto.DeliveryDto;
import com.vesolovskyi.dto.DrinkDto;
import org.springframework.stereotype.Component;

@Component
public class DrinkMapper extends AbstractMapper<Drink, DrinkDto>{
    @Override
    public DrinkDto mapObjectToDto(Drink drink) {
        if (drink == null) return null;

        DrinkDto.DrinkDtoBuilder drinkDtoBuilder = DrinkDto.builder();
        drinkDtoBuilder.id(drink.getId());
        drinkDtoBuilder.name(drink.getName());
        drinkDtoBuilder.size(drink.getSize());
        drinkDtoBuilder.price(drink.getPrice());
        drinkDtoBuilder.callories(drink.getCallories());

        return drinkDtoBuilder.build();
    }
}
