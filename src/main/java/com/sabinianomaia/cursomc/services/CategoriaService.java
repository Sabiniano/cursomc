package com.sabinianomaia.cursomc.services;


import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabinianomaia.cursomc.domain.Categoria;
import com.sabinianomaia.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	//public Categoria find(Integer id) {
		//Optional<Categoria> obj = repo.findById(id);
		//return obj.orElseThrow(() -> new ObjectNotFoundException(
				//"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
	//}
	
		//public Categoria buscar(Integer id) {
			//Optional<Categoria> obj = repo.findById(id);
			//if (obj == null) {
				//Throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					//	+ ", Tipo: " + Categoria.class.getName());
			//}
			//return obj.orElse(null);
		//}
		
		public Categoria find(Integer id) {
			Optional<Categoria> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
			}


}
