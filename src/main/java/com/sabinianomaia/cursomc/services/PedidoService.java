package com.sabinianomaia.cursomc.services;


import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabinianomaia.cursomc.domain.Pedido;
import com.sabinianomaia.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	//public Pedido find(Integer id) {
		//Optional<Pedido> obj = repo.findById(id);
		//return obj.orElseThrow(() -> new ObjectNotFoundException(
				//"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(), null));
	//}
	
		//public Pedido buscar(Integer id) {
			//Optional<Pedido> obj = repo.findById(id);
			//if (obj == null) {
				//Throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					//	+ ", Tipo: " + Pedido.class.getName());
			//}
			//return obj.orElse(null);
		//}
		
		public Pedido find(Integer id) {
			Optional<Pedido> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(), null));
			}


}
