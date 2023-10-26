package ej03;

import java.util.ArrayList;

public class Barrio {
	
	private String nombre;
	private ArrayList<Propiedad> propiedades;

	public Barrio(String nombre) {
		setNombre(nombre);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Propiedad> mostrarPropiedades (tipo){
		
		//recibe un enum y deveulve un arraylist de propiedades
		ArrayList<Propiedad> propiedadesMostradas = new ArrayList<Propiedad>();
		
	return propiedadesMostradas;	
	}

}


