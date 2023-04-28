package com.demo.CrudPrueba.repositories;

import com.demo.CrudPrueba.models.MastroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMastroRepositore extends JpaRepository <MastroModel, Integer>{
}
