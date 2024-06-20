package com.example.demo;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface SocioRepositorio extends Repository<EntidadSocio, Long> {
	List<EntidadSocio>findAll();
//	EntidadSocio findOne(long id);  
	
	EntidadSocio save(EntidadSocio s);
	void delete(EntidadSocio s);

}
