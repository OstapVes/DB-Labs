package com.vesolovskyi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PizzaDto {
    private Integer id;
    private String name;
    private Integer price;
    private Integer callories;
    private Integer weight;
    private String size;
}