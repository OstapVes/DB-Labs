package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.Delivery;
import com.vesolovskyi.dto.DeliveryDto;
import org.springframework.stereotype.Component;

@Component
public class DeliveryMapper extends AbstractMapper<Delivery, DeliveryDto>{
    @Override
    public DeliveryDto mapObjectToDto(Delivery delivery) {
        if (delivery == null) return null;

        DeliveryDto.DeliveryDtoBuilder deliveryDtoBuilder = DeliveryDto.builder();
        deliveryDtoBuilder.id(delivery.getId());
        deliveryDtoBuilder.name(delivery.getName());
        deliveryDtoBuilder.address(delivery.getAddress());
        deliveryDtoBuilder.workSchedule(delivery.getWorkSchedule());
        deliveryDtoBuilder.deliveryTime(delivery.getDeliveryTime());
        deliveryDtoBuilder.discount(delivery.getDiscount());
        deliveryDtoBuilder.paymentMethod(delivery.getPaymentMethod());

        return deliveryDtoBuilder.build();
    }
}
