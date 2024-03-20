package com.ashonplafa.activoFijo.repository;

import com.ashonplafa.activoFijo.entity.ActivoFijo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActivoFijoRepository extends CrudRepository<ActivoFijo, Long> {



}
