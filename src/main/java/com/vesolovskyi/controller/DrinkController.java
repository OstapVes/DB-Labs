package com.vesolovskyi.controller;

import com.vesolovskyi.domain.Drink;
import com.vesolovskyi.dto.DrinkDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.DrinkMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.DrinkService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/drink")
@RestController
@AllArgsConstructor
public class DrinkController extends AbstractController<Drink, DrinkDto, Integer> {
    private final DrinkService drinkService;
    private final DrinkMapper drinkMapper;


    @Override
    protected AbstractService<Drink, Integer> getService() {
        return drinkService;
    }

    @Override
    protected AbstractMapper<Drink, DrinkDto> getMapper() {
        return drinkMapper;
    }
}