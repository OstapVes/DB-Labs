package com.vesolovskyi.controller;

import com.vesolovskyi.domain.AdditivesForPizza;
import com.vesolovskyi.dto.AdditivesForPizzaDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.AdditivesForPizzaMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.AdditivesForPizzaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/additivesForPizza")
@RestController
@AllArgsConstructor
public class AdditivesForPizzaController extends AbstractController<AdditivesForPizza, AdditivesForPizzaDto, Integer> {
    private final AdditivesForPizzaService additivesForPizzaService;
    private final AdditivesForPizzaMapper additivesForPizzaMapper;


    @Override
    protected AbstractService<AdditivesForPizza, Integer> getService() {
        return additivesForPizzaService;
    }

    @Override
    protected AbstractMapper<AdditivesForPizza, AdditivesForPizzaDto> getMapper() {
        return additivesForPizzaMapper;
    }
}
