package com.panweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panweb.model.Productos;

public interface IProductoRepo extends JpaRepository<Productos, Integer>{

}
