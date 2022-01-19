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

    @Column(unique = true)
    private Integer cod;

    private LoanStatus status;

    private Months firstMonth;

    private Integer numMonths;

    private Instant moment;

    private Integer bestDay;

    private Long value;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LoanSim() {
    }

    public LoanSim(Long id, Integer cod, LoanStatus status, Months firstMonth, Integer numMonths, Instant moment, Integer bestDay, Long value, Client client) {
        this.id = id;
        this.cod = cod;
        this.status = status;
        this.firstMonth = firstMonth;
        this.numMonths = numMonths;
        this.moment = moment;
        this.bestDay = bestDay;
        this.value = value;
        this.client = client;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
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

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
