package com.vesolovskyi.controller;

import com.vesolovskyi.domain.Pizza;
import com.vesolovskyi.dto.PizzaDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.PizzaMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.PizzaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/pizza")
@RestController
@AllArgsConstructor
public class PizzaController extends AbstractController<Pizza, PizzaDto, Integer> {
    private final PizzaService pizzaService;
    private final PizzaMapper pizzaMapper;


    @Override
    protected AbstractService<Pizza, Integer> getService() {
        return pizzaService;
    }

    @Override
    protected AbstractMapper<Pizza, PizzaDto> getMapper() {
        return pizzaMapper;
    }
}