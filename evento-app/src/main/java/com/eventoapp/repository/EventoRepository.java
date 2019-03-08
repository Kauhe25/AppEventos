package com.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eventoapp.models.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, String>{
	
	Evento findByCodigo(long codigo);

}
