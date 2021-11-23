package com.vesolovskyi.repository;

import com.vesolovskyi.domain.Salad;
import com.vesolovskyi.dto.SaladDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaladRepository extends JpaRepository<Salad, Integer> {
}
