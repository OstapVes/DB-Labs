package com.vesolovskyi.mapper;

import com.vesolovskyi.domain.City;
import com.vesolovskyi.dto.CityDto;
import org.springframework.stereotype.Component;

@Component
public class CityMapper extends AbstractMapper<City, CityDto>{
    @Override
    public CityDto mapObjectToDto(City city) {
        if (city == null) return null;

        CityDto.CityDtoBuilder cityDtoBuilder = CityDto.builder();
        cityDtoBuilder.id(city.getId());
        cityDtoBuilder.name(city.getName());

        return cityDtoBuilder.build();
    }
}
