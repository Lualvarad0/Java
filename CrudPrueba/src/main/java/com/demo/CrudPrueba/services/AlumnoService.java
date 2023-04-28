package com.demo.CrudPrueba.services;

import com.demo.CrudPrueba.models.AlumnoModel;

import java.util.List;
import java.util.Optional;

public interface AlumnoService {

    List<AlumnoModel> getAll();

    Optional<AlumnoModel> getById(int id);

    AlumnoModel create(AlumnoModel alumnoModel);

    boolean update(int id, AlumnoModel updatedAlumnoModel);

    boolean delete(int id);

}
