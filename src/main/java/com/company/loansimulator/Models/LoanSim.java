package com.company.loansimulator.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.Instant;
import java.time.Month;

@Entity
@Table(name = "tb_loan_sim")
public class LoanSim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private LoanStatus status;

    private Months firstMonth;

    private Integer numMonths;

    private Instant moment;

    private Integer bestDay;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "loan_id")
    private Loan loan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoanSim() {
    }

    public LoanSim(Long id, LoanStatus status, Months firstMonth, Integer numMonths, Instant moment, Integer bestDay, Client client, Loan loan) {
        this.id = id;
        this.status = status;
        this.firstMonth = firstMonth;
        this.numMonths = numMonths;
        this.moment = moment;
        this.bestDay = bestDay;
        this.client = client;
        this.loan = loan;
    }

    public Client getClient() {
        return client;
    }

    public Loan getLoan() {
        return loan;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public Months getFirstMonth() {
        return firstMonth;
    }

    public void setFirstMonth(Months firstMonth) {
        this.firstMonth = firstMonth;
    }

    public Integer getNumMonths() {
        return numMonths;
    }

    public void setNumMonths(Integer numMonths) {
        this.numMonths = numMonths;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Integer getBestDay() {
        return bestDay;
    }

    public void setBestDay(Integer bestDay) {
        this.bestDay = bestDay;
    }
}
