package com.demo.CrudPrueba.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Entity
@Table(name = "alumno_has_materia")
public class AlumnohasMateriaModel {

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("alumnoId")
    private AlumnoModel alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("materiaId")
    private MateriaModel materia;

    public AlumnoModel getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoModel alumno) {
        this.alumno = alumno;
    }

    public MateriaModel getMateria() {
        return materia;
    }

    public void setMateria(MateriaModel materia) {
        this.materia = materia;
    }
}



