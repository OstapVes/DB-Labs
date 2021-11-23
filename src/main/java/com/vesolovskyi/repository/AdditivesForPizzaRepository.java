package com.vesolovskyi.repository;

import com.vesolovskyi.domain.AdditivesForPizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditivesForPizzaRepository extends JpaRepository<AdditivesForPizza, Integer> {
}
