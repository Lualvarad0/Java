package com.demo.CrudPrueba.repositories;

import com.demo.CrudPrueba.models.AlumnoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<AlumnoModel, Integer> {

}
