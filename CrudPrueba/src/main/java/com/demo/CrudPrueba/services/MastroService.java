package com.demo.CrudPrueba.services;

import com.demo.CrudPrueba.models.MastroModel;
import com.demo.CrudPrueba.repositories.IMastroRepositore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MastroService {

    @Autowired
    private IMastroRepositore mastroRepository;

    public List<MastroModel> getAll() {
        return mastroRepository.findAll();
    }

    public Optional<MastroModel> getById(int id) {
        return mastroRepository.findById(id);
    }

    public MastroModel create(MastroModel mastroModel) {
        return mastroRepository.save(mastroModel);
    }

    public boolean update(int id, MastroModel updatedMastroModel) {
        Optional<MastroModel> optionalMastroModel = mastroRepository.findById(id);
        if (optionalMastroModel.isPresent()) {
            MastroModel mastroModel = optionalMastroModel.get();
            mastroModel.setNombre(updatedMastroModel.getNombre());
            mastroModel.setApellido(updatedMastroModel.getApellido());
            mastroModel.setTitulo(updatedMastroModel.getTitulo());
            mastroRepository.save(mastroModel);
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        Optional<MastroModel> optionalMastroModel = getById(id);
        if (optionalMastroModel.isPresent()) {
            mastroRepository.delete(optionalMastroModel.get());
            return true;
        }
        return false;
    }
}
