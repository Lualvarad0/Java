package com.demo.CrudPrueba.Controller;

import com.demo.CrudPrueba.models.MateriaModel;
import com.demo.CrudPrueba.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public ResponseEntity<?> getAllMaterias() {
        return ResponseEntity.ok(materiaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMateriaById(@PathVariable int id) {
        return materiaService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> createMateria(@RequestBody MateriaModel materiaModel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(materiaService.create(materiaModel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMateria(@PathVariable int id, @RequestBody MateriaModel updatedMateriaModel){
        materiaService.update(id, updatedMateriaModel);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMateria(@PathVariable int id) {
        materiaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
