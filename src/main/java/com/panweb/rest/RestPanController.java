package com.panweb.rest;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.panweb.model.Empleados;
import com.panweb.model.Productos;
import com.panweb.repo.IEmpleadosRepo;
import com.panweb.repo.IProductoRepo;



@RestController
public class RestPanController {
    
	@Autowired
	private IEmpleadosRepo repo;
	
	@Autowired
	private IProductoRepo repo1;
	
	@GetMapping("/consultar/empleados")
	public List<Empleados>listarempleados(){
		return repo.findAll();
	}
	
	@GetMapping("/consultar/productos")
	public List<Productos>listarProductos(){
		return repo1.findAll();
	}
	
	@PostMapping("/insertar/empleados")
	public void insertarempleados (@RequestBody Empleados per) {
		repo.save(per);
	}
	
	@PostMapping("/insertar/productos")
	public void insertarproductos (@RequestBody Productos per) {
		repo1.save(per);
	}
	
	@PutMapping("/modificar/empleados")
	public void modificarempleados (@RequestBody Empleados per) {
		repo.save(per);
	}
	
	@PutMapping("/modificar/productos")
	public void modificarproductos (@RequestBody Productos per) {
		repo1.save(per);
	}
	
	@DeleteMapping(value = "/eliminar/empleado/{id}")
	public void eliminarempleados (@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
	
	@DeleteMapping(value = "/eliminar/productos/{id}")
	public void eliminarproductos (@PathVariable("id") Integer id) {
		
		repo1.deleteById(id);
	}
}
