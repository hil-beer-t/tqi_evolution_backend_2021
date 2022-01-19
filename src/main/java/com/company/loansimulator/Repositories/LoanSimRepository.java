package com.company.loansimulator.Repositories;

import com.company.loansimulator.Models.LoanSim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanSimRepository extends JpaRepository<LoanSim, Long> {
}