package com.company.loansimulator.controllers;

import com.company.loansimulator.models.Client;
import com.company.loansimulator.models.LoanSim;
import com.company.loansimulator.repositories.ClientRepository;
import com.company.loansimulator.repositories.LoanSimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientControllers {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    LoanSimRepository loanSimRepository;

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients(){
        List<Client> clients = new ArrayList<>(clientRepository.findAll());
        return ResponseEntity.ok(clients);
    }

    @PostMapping
    public ResponseEntity<Client> insertClient(@RequestBody Client obj){

        Client client = clientRepository.findByEmail(obj.getEmail());

        if ( client != null){
            return ResponseEntity.unprocessableEntity().build();
        }

        //obj.setPassword(passwordEncoder.encode(obj.getPassword()));
        obj = clientRepository.save(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id){
        Client client = clientRepository.findById(id).get();
        return ResponseEntity.ok(client);
    }

    @PostMapping(value = "/{id}/create-loan-sim")
    public ResponseEntity<LoanSim> createLoanSim(@RequestBody LoanSim obj, @PathVariable Long id){

        // TODO: create YEAR + MONTH + DAY loanSim code
        // TODO: autenticate

        Client client = clientRepository.findById(id).get();
        obj.setClient(client);
        obj = loanSimRepository.save(obj);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
}
