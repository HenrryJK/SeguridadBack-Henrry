package pe.apirestoracle.entity;

public class Persona {
private int  id_persona;
private String nombres;
private String dni;
public Persona() {
	super();
}
public Persona(int id_persona, String nombres, String dni) {
	super();
	this.id_persona = id_persona;
	this.nombres = nombres;
	this.dni = dni;
}
public int getId_persona() {
	return id_persona;
}
public void setId_persona(int id_persona) {
	this.id_persona = id_persona;
}
public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
}
