package com.company.loansimulator.Repositories;

import com.company.loansimulator.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}