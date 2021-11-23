package com.vesolovskyi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeliveryDto {
    private Integer id;
    private String name;
    private String address;
    private String workSchedule;
    private String deliveryTime;
    private String discount;
    private String paymentMethod;
}
