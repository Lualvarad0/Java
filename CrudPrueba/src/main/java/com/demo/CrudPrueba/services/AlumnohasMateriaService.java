package com.demo.CrudPrueba.services;

import com.demo.CrudPrueba.models.AlumnohasMateriaModel;
import com.demo.CrudPrueba.repositories.IAlumnhasMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class AlumnohasMateriaService {

    @Autowired
    private IAlumnhasMateriaRepository alumnohasMateriaRepository;

    public List<AlumnohasMateriaModel> getAll() {
        return alumnohasMateriaRepository.findAll();
    }

    public Optional<AlumnohasMateriaModel> getById(Long alumnoId, Long materiaId) {
        return alumnohasMateriaRepository.findByIds(alumnoId, materiaId);
    }

    public AlumnohasMateriaModel create(AlumnohasMateriaModel alumnohasMateriaModel) {
        return alumnohasMateriaRepository.save(alumnohasMateriaModel);
    }

    public void update(Long alumnoId, Long materiaId, AlumnohasMateriaModel updatedAlumnohasMateriaModel) {
        Optional<AlumnohasMateriaModel> alumnohasMateriaModel = alumnohasMateriaRepository.findByIds(alumnoId, materiaId);
        if (alumnohasMateriaModel.isPresent()) {
            AlumnohasMateriaModel existingAlumnohasMateriaModel = alumnohasMateriaModel.get();
            existingAlumnohasMateriaModel.setAlumno(updatedAlumnohasMateriaModel.getAlumno());
            existingAlumnohasMateriaModel.setMateria(updatedAlumnohasMateriaModel.getMateria());
            alumnohasMateriaRepository.save(existingAlumnohasMateriaModel);
        }
    }

    public void delete(Long alumnoId, Long materiaId) {
        Optional<AlumnohasMateriaModel> alumnohasMateriaModel = alumnohasMateriaRepository.findByIds(alumnoId, materiaId);
        if (alumnohasMateriaModel.isPresent()) {
            alumnohasMateriaRepository.delete(alumnohasMateriaModel.get());
        }
    }
}

