package com.vesolovskyi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaladDto {
    private Integer id;
    private String name;
    private Integer price;
    private String composition;
    private String weight;
    private Integer callories;
}
