package com.demo.CrudPrueba.Controller;

import com.demo.CrudPrueba.models.AlumnoModel;
import com.demo.CrudPrueba.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/")
    public List<AlumnoModel> getAll() {
        return alumnoService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlumnoModel> getById(@PathVariable int id) {
        Optional<AlumnoModel> optionalAlumnoModel = alumnoService.getById(id);
        if (optionalAlumnoModel.isPresent()) {
            return new ResponseEntity<>(optionalAlumnoModel.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<AlumnoModel> create(@RequestBody AlumnoModel alumnoModel) {
        AlumnoModel createdAlumnoModel = alumnoService.create(alumnoModel);
        return new ResponseEntity<>(createdAlumnoModel, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlumnoModel> update(@PathVariable int id, @RequestBody AlumnoModel updatedAlumnoModel) {
        boolean wasUpdated = alumnoService.update(id, updatedAlumnoModel);
        if (wasUpdated) {
            return new ResponseEntity<>(updatedAlumnoModel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable int id) {
        boolean wasDeleted = alumnoService.delete(id);
        if (wasDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
