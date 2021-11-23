package com.vesolovskyi.controller;

import com.vesolovskyi.domain.Delivery;
import com.vesolovskyi.dto.DeliveryDto;
import com.vesolovskyi.mapper.AbstractMapper;
import com.vesolovskyi.mapper.DeliveryMapper;
import com.vesolovskyi.service.AbstractService;
import com.vesolovskyi.service.DeliveryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/delivery")
@RestController
@AllArgsConstructor
public class DeliveryController extends AbstractController<Delivery, DeliveryDto, Integer> {
    private final DeliveryService deliveryService;
    private final DeliveryMapper deliveryMapper;


    @Override
    protected AbstractService<Delivery, Integer> getService() {
        return deliveryService;
    }

    @Override
    protected AbstractMapper<Delivery, DeliveryDto> getMapper() {
        return deliveryMapper;
    }
}
