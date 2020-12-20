package pe.apirestoracle.service;

import java.util.Map;

import pe.apirestoracle.entity.Persona;

public interface PersonaService {
	int create(Persona p);
	int update(Persona p);
	int update(int id);
	int delete(int id);
	Persona read(int id);
	Map<String, Object> readAll();
}
