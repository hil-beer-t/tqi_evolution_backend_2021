package com.company.loansimulator;

import com.company.loansimulator.models.*;
import com.company.loansimulator.repositories.ClientRepository;
import com.company.loansimulator.repositories.LoanSimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Arrays;

@SpringBootApplication
public class LoanSimulatorApplication implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    LoanSimRepository loanSimRepository;

    public static void main(String[] args) {
        SpringApplication.run(LoanSimulatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Client client1 = new Client(null,"Maria","maria@gmail.com",1348.74, "54090795079", "16.324.596-4", "Rua Três", "123321");
        Client client2 = new Client(null, "Joao Silva","joao@gmail.com",9276.62, "35917941041", "49.615.394-8", "Rua Três", "123321");
        Client client3 = new Client(null, "Carlos Silva","carlos@gmail.com",7318.75, "32994547066", "29.855.904-3", "Rua Três", "123321");

        clientRepository.saveAll(Arrays.asList(client1,client2,client3));

        LoanSim loanSim1 = new LoanSim(null, "2022011074", LoanStatus.WAITING_FOR_APPROVAL, Months.JANUARY, 60, Instant.parse("2022-01-20T11:25:09Z"), 5, 5000L,client1);
        LoanSim loanSim2 = new LoanSim(null, "202201186", LoanStatus.APPROVED, Months.APRIL, 50, Instant.parse("2022-01-10T12:30:00Z"), 10, 10000L, client1);

        loanSimRepository.saveAll(Arrays.asList(loanSim1,loanSim2));

    }
}
