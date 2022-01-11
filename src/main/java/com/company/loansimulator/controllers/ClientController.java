package com.company.loansimulator.controllers;

import com.company.loansimulator.api.ClientApi;
import com.company.loansimulator.models.Client;
import com.company.loansimulator.models.Loan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController implements ClientApi {
    @Override
    public ResponseEntity<Void> createClient(Client body) {
        System.out.println(body);
        return null;
    }

    @Override
    public ResponseEntity<Void> createLoan(Loan body, String id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteClient(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = new ArrayList<>();
        Client client = new Client();
        client.setClientId(1);
        client.setCpf("09257925005");
        client.setAddress("Rua b, Cidade A, Estado C");
        client.setEmail("joao@gmail.com");
        client.setName("joao silva");
        client.setIncome(600000);
        client.setStatus("new");
        client.setRg("654654");
        client.setPassword("nabuco");
        client.setLoanId(null);


        clients.add(client);

        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Client>> getClientById(String id) {
        return null;
    }
}
