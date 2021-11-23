package com.vesolovskyi.repository;

import com.vesolovskyi.domain.PizzaComposition;
import com.vesolovskyi.domain.Salad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaCompositionRepository extends JpaRepository<PizzaComposition, Integer> {
}
