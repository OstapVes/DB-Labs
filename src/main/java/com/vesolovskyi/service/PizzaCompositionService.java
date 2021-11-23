package com.vesolovskyi.service;

import com.vesolovskyi.domain.PizzaComposition;
import com.vesolovskyi.repository.PizzaCompositionRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class PizzaCompositionService extends AbstractService<PizzaComposition, Integer> {
    public PizzaCompositionRepository pizzaCompositionRepository;

    @Override
    protected JpaRepository<PizzaComposition, Integer> getRepository() {
        return pizzaCompositionRepository;
    }
}
