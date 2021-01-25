package com.panweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panweb.model.Empleados;

public interface IEmpleadosRepo extends JpaRepository<Empleados, Integer>{

}
