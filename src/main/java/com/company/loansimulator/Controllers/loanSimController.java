package com.company.loansimulator.Controllers;

import com.company.loansimulator.Models.LoanSim;
import com.company.loansimulator.Repositories.LoanSimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/loan-sim")
public class loanSimController {

    @Autowired
    LoanSimRepository loanSimRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<LoanSim> findById(@PathVariable Long id){
            LoanSim loanSim = loanSimRepository.findById(id).get();
            return ResponseEntity.ok(loanSim);
    }

}
