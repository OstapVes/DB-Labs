package com.vesolovskyi.service;

import com.vesolovskyi.domain.AdditivesForPizza;
import com.vesolovskyi.domain.Delivery;
import com.vesolovskyi.repository.AdditivesForPizzaRepository;
import com.vesolovskyi.repository.DeliveryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class AdditivesForPizzaService extends AbstractService<AdditivesForPizza, Integer> {
    public AdditivesForPizzaRepository additivesForPizzaRepository;

    @Override
    protected JpaRepository<AdditivesForPizza, Integer> getRepository() {
        return additivesForPizzaRepository;
    }
}