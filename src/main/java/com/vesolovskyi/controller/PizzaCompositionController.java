package com.vesolovskyi.controller;

import com.vesolovskyi.domain.PizzaComposition;
import com.vesolovskyi.dto.PizzaCompositionDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.PizzaCompositionMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.PizzaCompositionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/pizzaComposition")
@RestController
@AllArgsConstructor
public class PizzaCompositionController extends AbstractController<PizzaComposition, PizzaCompositionDto, Integer> {
    private final PizzaCompositionService pizzaCompositionService;
    private final PizzaCompositionMapper pizzaCompositionMapper;


    @Override
    protected AbstractService<PizzaComposition, Integer> getService() {
        return pizzaCompositionService;
    }

    @Override
    protected AbstractMapper<PizzaComposition, PizzaCompositionDto> getMapper() {
        return pizzaCompositionMapper;
    }
}