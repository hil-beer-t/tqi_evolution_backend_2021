package com.company.loansimulator.Repositories;

import com.company.loansimulator.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}