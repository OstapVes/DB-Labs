package com.vesolovskyi.service;

import com.vesolovskyi.domain.Drink;
import com.vesolovskyi.repository.DrinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class DrinkService extends AbstractService<Drink, Integer> {
    public DrinkRepository drinkRepository;

    @Override
    protected JpaRepository<Drink, Integer> getRepository() {
        return drinkRepository;
    }
}
