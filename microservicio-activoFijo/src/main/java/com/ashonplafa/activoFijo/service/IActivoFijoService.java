package com.ashonplafa.activoFijo.service;

import com.ashonplafa.activoFijo.entity.ActivoFijo;

import java.util.List;

public interface IActivoFijoService {

    List<ActivoFijo> findAll();

    ActivoFijo findById(Long id);

    void save(ActivoFijo activoFijo);




}
