package ej11;

import java.util.ArrayList;

public class Piloto {
	
	private String nombre;
	private String dni;
	private ArrayList<Vuelta> vueltas;
		
	public Piloto(String nombre, String dni) {
		setNombre(nombre);
		setDni(dni);
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public ArrayList<Vuelta> getVueltas() {
		return vueltas;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setDni(String dni) {
		this.dni = dni;
	}
	private void setVueltas(ArrayList<Vuelta> vueltas) {
		this.vueltas = vueltas;
	}
	
	
	

}
