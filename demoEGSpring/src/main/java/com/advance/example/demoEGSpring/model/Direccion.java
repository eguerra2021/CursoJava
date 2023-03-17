package com.advance.example.demoEGSpring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@Table(name = "direccion")
public class Direccion {
    @Id
    private int id;
    private String direccion;
    private String nomenclatura;
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    private Cliente cliente;

}
