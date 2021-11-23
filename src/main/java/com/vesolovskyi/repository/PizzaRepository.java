package com.vesolovskyi.repository;

import com.vesolovskyi.domain.Delivery;
import com.vesolovskyi.domain.Pizza;
import com.vesolovskyi.domain.Salad;
import com.vesolovskyi.service.AbstractService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
