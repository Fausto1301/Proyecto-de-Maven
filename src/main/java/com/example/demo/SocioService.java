package com.example.demo;

import java.util.List;

public interface SocioService {
	
	
	List<EntidadSocio>listar();
	EntidadSocio listarId(long id);
	EntidadSocio add(EntidadSocio s);
	EntidadSocio edit(EntidadSocio s);
	EntidadSocio delet(long id);
	
}
