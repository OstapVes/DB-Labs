package com.vesolovskyi.repository;

import com.vesolovskyi.domain.Address;
import com.vesolovskyi.domain.Client;
import com.vesolovskyi.domain.Salad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
