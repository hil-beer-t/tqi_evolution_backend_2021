package com.company.loansimulator.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private Double income;

    @Column(unique = true)
    private String cpf;

    @Column(unique = true)
    private String rg;

    private String address;

    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "client" )
    private List<LoanSim> loanSims = new ArrayList<>();

    public Client() {
    }

    public Client(Long id, String name, String email, Double income, String cpf, String rg, String address, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.income = income;
        this.cpf = cpf;
        this.rg = rg;
        this.address = address;
        this.password = password;
    }

    public List<LoanSim> getLoanSims() {
        return loanSims;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}