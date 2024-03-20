package com.ashonplafa.activoFijo.controller;

import com.ashonplafa.activoFijo.entity.ActivoFijo;
import com.ashonplafa.activoFijo.service.IActivoFijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/activoFijo")
@CrossOrigin("*")
public class ActivoFijoController {

    @Autowired
    private IActivoFijoService activoFijoService;

    //EndPoints
    //crear activo fijo
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveActivoFijo(@RequestBody ActivoFijo activoFijo){
        activoFijoService.save(activoFijo);
    }

    //buscar todos
    @GetMapping("/all")
    public ResponseEntity<?> findAllActivoFijo(){
        return ResponseEntity.ok(activoFijoService.findAll());
    }

    //buscar por id
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(activoFijoService.findById(id));
    }

}
