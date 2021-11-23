package com.vesolovskyi.service;

import com.vesolovskyi.domain.Salad;
import com.vesolovskyi.repository.SaladRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SaladService extends AbstractService<Salad, Integer> {
    public SaladRepository saladRepository;

    @Override
    protected JpaRepository<Salad, Integer> getRepository() {
        return saladRepository;
    }
}
