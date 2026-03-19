package com.baozistore.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private LocalDate clienteDesde;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getClienteDesde() {
        return clienteDesde;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClienteDesde(LocalDate clienteDesde) {
        this.clienteDesde = clienteDesde;
    }
}