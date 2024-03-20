package com.ashonplafa.activoFijo.service;

import com.ashonplafa.activoFijo.entity.ActivoFijo;
import com.ashonplafa.activoFijo.repository.IActivoFijoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivoFijoServiceImpl implements IActivoFijoService {

    @Autowired
    private IActivoFijoRepository activoFijoRepository;

    @Override
    public List<ActivoFijo> findAll() {
        return (List<ActivoFijo>) activoFijoRepository.findAll();
    }

    @Override
    public ActivoFijo findById(Long id) {
        return activoFijoRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(ActivoFijo activoFijo) {
        activoFijoRepository.save(activoFijo);
    }
}
