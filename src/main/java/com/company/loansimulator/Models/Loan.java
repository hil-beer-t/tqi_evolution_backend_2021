package com.company.loansimulator.Models;

import javax.persistence.*;

@Entity
@Table(name = "tb_loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true)
    private Integer cod;

    private Long value;

    @OneToOne(mappedBy = "loan")
    private LoanSim loanSim;

    public Loan() {
    }

    public Loan(Long id, Integer cod, Long value) {
        this.id = id;
        this.cod = cod;
        this.value = value;
    }

    public LoanSim getLoanSim() {
        return loanSim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}