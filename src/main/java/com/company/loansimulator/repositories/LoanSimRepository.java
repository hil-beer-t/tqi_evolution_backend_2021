package com.company.loansimulator.repositories;

import com.company.loansimulator.models.LoanSim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanSimRepository extends JpaRepository<LoanSim, Long> {
}