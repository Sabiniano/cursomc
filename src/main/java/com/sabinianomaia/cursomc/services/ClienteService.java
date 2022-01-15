package com.sabinianomaia.cursomc.services;


import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabinianomaia.cursomc.domain.Cliente;
import com.sabinianomaia.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	//public Cliente find(Integer id) {
		//Optional<Cliente> obj = repo.findById(id);
		//return obj.orElseThrow(() -> new ObjectNotFoundException(
				//"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(), null));
	//}
	
		//public Cliente buscar(Integer id) {
			//Optional<Cliente> obj = repo.findById(id);
			//if (obj == null) {
				//Throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					//	+ ", Tipo: " + Cliente.class.getName());
			//}
			//return obj.orElse(null);
		//}
		
		public Cliente find(Integer id) {
			Optional<Cliente> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(), null));
			}


}
