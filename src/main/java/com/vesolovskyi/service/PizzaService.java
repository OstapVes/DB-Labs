package com.vesolovskyi.service;

import com.vesolovskyi.domain.Pizza;
import com.vesolovskyi.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class PizzaService extends AbstractService<Pizza, Integer> {
    public PizzaRepository pizzaRepository;

    @Override
    protected JpaRepository<Pizza, Integer> getRepository() {
        return pizzaRepository;
    }
}
