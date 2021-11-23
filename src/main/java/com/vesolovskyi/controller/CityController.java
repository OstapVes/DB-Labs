package com.vesolovskyi.controller;

import com.vesolovskyi.domain.City;
import com.vesolovskyi.dto.CityDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.CityMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/city")
@RestController
@AllArgsConstructor
public class CityController extends AbstractController<City, CityDto, Integer> {
    private final CityService cityService;
    private final CityMapper cityMapper;


    @Override
    protected AbstractService<City, Integer> getService() {
        return cityService;
    }

    @Override
    protected AbstractMapper<City, CityDto> getMapper() {
        return cityMapper;
    }
}