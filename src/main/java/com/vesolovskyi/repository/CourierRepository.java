package com.vesolovskyi.repository;

import com.vesolovskyi.domain.Courier;
import com.vesolovskyi.domain.Salad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRepository extends JpaRepository<Courier, Integer> {
}
