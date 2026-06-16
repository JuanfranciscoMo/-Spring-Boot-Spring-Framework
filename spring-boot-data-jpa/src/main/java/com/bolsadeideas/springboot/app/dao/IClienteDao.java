 package com.bolsadeideas.springboot.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
}
