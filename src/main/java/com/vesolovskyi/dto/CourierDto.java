package com.vesolovskyi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourierDto {
    private Integer id;
    private String name;
    private String telNumber;
    private String location;
    private String transport;
    private Integer fulfilledTheOrder;
}
