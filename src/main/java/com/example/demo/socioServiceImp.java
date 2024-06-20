package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class socioServiceImp implements SocioService {
	@Autowired
	private  SocioRepositorio repositorio;

	@Override
	public List<EntidadSocio> listar() {
		
		return repositorio.findAll();
	}

	@Override
	public EntidadSocio listarId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntidadSocio add(EntidadSocio s) {
		// TODO Auto-generated method stub
		return repositorio.save(s);
	}

	@Override
	public EntidadSocio edit(EntidadSocio s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntidadSocio delet(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
