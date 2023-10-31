package ej11;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
	private ArrayList<Carrera> carreras;
	
	public Empresa(String nombre, ArrayList<Carrera> carreras) {
		setNombre(nombre);
		setCarreras(carreras);
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}
	
	
	

}
