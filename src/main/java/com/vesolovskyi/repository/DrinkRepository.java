package com.vesolovskyi.repository;

import com.vesolovskyi.domain.Drink;
import com.vesolovskyi.domain.Salad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {
}
