package com.vesolovskyi.controller;

import com.vesolovskyi.domain.Salad;
import com.vesolovskyi.dto.SaladDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.SaladMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.SaladService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/salad")
@RestController
@AllArgsConstructor
public class SaladController extends AbstractController<Salad, SaladDto, Integer> {
    private final SaladService saladService;
    private final SaladMapper saladMapper;


    @Override
    protected AbstractService<Salad, Integer> getService() {
        return saladService;
    }

    @Override
    protected AbstractMapper<Salad, SaladDto> getMapper() {
        return saladMapper;
    }
}