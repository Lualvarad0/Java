package com.demo.CrudPrueba.Controller;

import com.demo.CrudPrueba.models.AlumnohasMateriaModel;
import com.demo.CrudPrueba.services.AlumnohasMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumno_has_materia")
public class AlumnohasMateriaController {

    @Autowired
    private AlumnohasMateriaService alumnohasMateriaService;

    @GetMapping("/all")
    public List<AlumnohasMateriaModel> getAll() {
        return alumnohasMateriaService.getAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody AlumnohasMateriaModel alumnohasMateriaModel) {
        alumnohasMateriaService.create(alumnohasMateriaModel);
    }

    @DeleteMapping("/delete/{alumnoId}/{materiaId}")
    public void delete(@PathVariable Long alumnoId, @PathVariable Long materiaId) {
        alumnohasMateriaService.delete(alumnoId, materiaId);
    }
}
