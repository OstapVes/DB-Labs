package com.vesolovskyi.controller;

import com.vesolovskyi.domain.Courier;
import com.vesolovskyi.dto.CourierDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.CourierMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.CourierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/courier")
@RestController
@AllArgsConstructor
public class CourierController extends AbstractController<Courier, CourierDto, Integer> {
    private final CourierService courierService;
    private final CourierMapper courierMapper;


    @Override
    protected AbstractService<Courier, Integer> getService() {
        return courierService;
    }

    @Override
    protected AbstractMapper<Courier, CourierDto> getMapper() {
        return courierMapper;
    }
}