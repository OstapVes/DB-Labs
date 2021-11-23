package com.vesolovskyi.service;

import com.vesolovskyi.domain.Delivery;
import com.vesolovskyi.repository.DeliveryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeliveryService extends AbstractService<Delivery, Integer> {
    public DeliveryRepository deliveryRepository;

    @Override
    protected JpaRepository<Delivery, Integer> getRepository() {
        return deliveryRepository;
    }
}
