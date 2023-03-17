package com.advance.example.demoEGSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Tarjeta {
    @Id
    private int id;
    private int numero;
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "cliente_id",  referencedColumnName = "id")
    private Cliente cliente;

}
