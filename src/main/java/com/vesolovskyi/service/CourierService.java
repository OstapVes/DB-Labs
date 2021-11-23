package com.vesolovskyi.service;

import com.vesolovskyi.domain.Courier;
import com.vesolovskyi.repository.CourierRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class CourierService extends AbstractService<Courier, Integer> {
    public CourierRepository courierRepository;

    @Override
    protected JpaRepository<Courier, Integer> getRepository() {
        return courierRepository;
    }
}
