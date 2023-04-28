package com.demo.CrudPrueba.services;

import com.demo.CrudPrueba.models.MateriaModel;
import com.demo.CrudPrueba.repositories.IMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {

    @Autowired
    private IMateriaRepository materiaRepository;

    public List<MateriaModel> getAll() {
        return materiaRepository.findAll();
    }

    public Optional<MateriaModel> getById(int id) {
        return materiaRepository.findById(id);
    }

    public MateriaModel create(MateriaModel materiaModel) {
        return materiaRepository.save(materiaModel);
    }

    public void update(int id, MateriaModel updatedMateriaModel) {
        Optional<MateriaModel> materiaModel = materiaRepository.findById(id);
        if (materiaModel.isPresent()) {
            MateriaModel existingMateriaModel = materiaModel.get();
            existingMateriaModel.setDescripcion(updatedMateriaModel.getDescripcion());
            existingMateriaModel.setPuntos(updatedMateriaModel.getPuntos());
            materiaRepository.save(existingMateriaModel);
        }
    }

    public void delete(int id) {
        materiaRepository.deleteById(id);
    }
}
