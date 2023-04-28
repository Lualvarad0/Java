package com.demo.CrudPrueba.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "Mastro")
public class MastroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMastro;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String titulo;



    public int getIdMastro() {
        return idMastro;
    }

    public void setIdMastro(int idMastro) {
        this.idMastro = idMastro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
