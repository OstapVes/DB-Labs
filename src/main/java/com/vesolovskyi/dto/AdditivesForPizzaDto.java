package com.vesolovskyi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdditivesForPizzaDto {
    private Integer id;
    private String name;
    private Integer callories;
    private Integer price;
}
