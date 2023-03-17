package com.advance.example.demoEGSpring.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name= "cliente")
public class Cliente {
    @Id
    private int id;
    @Column(name = "Name")
    private String nombre;
    @Column(length = 30)
    private String apellidos;
    @Column(columnDefinition = "varchar(15)")
    private String cedula;
    private String telefono;



}
