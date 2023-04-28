package com.demo.CrudPrueba.repositories;

import com.demo.CrudPrueba.models.MateriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMateriaRepository extends JpaRepository<MateriaModel, Integer> {
}
