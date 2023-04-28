package com.demo.CrudPrueba.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Alumno")
public class AlumnoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlumno;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "Mastro_idMastro")
    private MastroModel mastro;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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

    public MastroModel getMastro() {
        return mastro;
    }

    public void setMastro(MastroModel mastro) {
        this.mastro = mastro;
    }
}
