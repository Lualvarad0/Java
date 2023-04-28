package com.demo.CrudPrueba.Controller;

import com.demo.CrudPrueba.models.MastroModel;
import com.demo.CrudPrueba.services.MastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mastro")
public class MastroController {

    @Autowired
    private MastroService mastroService;

    @GetMapping("/")
    public List<MastroModel> getAll() {
        return mastroService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MastroModel> getById(@PathVariable int id) {
        Optional<MastroModel> optionalMastroModel = mastroService.getById(id);
        if (optionalMastroModel.isPresent()) {
            return ResponseEntity.ok(optionalMastroModel.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public ResponseEntity<MastroModel> create(@RequestBody MastroModel mastroModel) {
        MastroModel createdMastroModel = mastroService.create(mastroModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMastroModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable int id, @RequestBody MastroModel updatedMastroModel) {
        boolean result = mastroService.update(id, updatedMastroModel);
        if (result) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        boolean result = mastroService.delete(id);
        if (result) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
