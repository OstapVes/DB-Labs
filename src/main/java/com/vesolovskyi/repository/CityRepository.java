package com.vesolovskyi.repository;

import com.vesolovskyi.domain.City;
import com.vesolovskyi.domain.Salad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}