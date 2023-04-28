package com.demo.CrudPrueba.repositories;

import com.demo.CrudPrueba.models.AlumnohasMateriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAlumnhasMateriaRepository extends JpaRepository<AlumnohasMateriaModel, Integer> {
    Optional<AlumnohasMateriaModel> findByIds(Long alumnoId, Long materiaId);
}