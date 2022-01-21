package com.company.loansimulator.controllers;

import com.company.loansimulator.models.LoanSim;
import com.company.loansimulator.repositories.LoanSimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/loan-sim")
public class LoanSimController {

    @Autowired
    LoanSimRepository loanSimRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<LoanSim> findById(@PathVariable Long id){
            LoanSim loanSim = loanSimRepository.findById(id).get();
            return ResponseEntity.ok(loanSim);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<LoanSim> createLoanSim(@RequestBody LoanSim obj){

        // TODO: create YEAR + MONTH + DAY loanSim code
        // TODO: autenticate

        obj = loanSimRepository.save(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

}
