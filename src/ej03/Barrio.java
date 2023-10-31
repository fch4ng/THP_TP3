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
	
	public void mostrarPropiedades (Tipo tipo){
		
		for (Propiedad propiedades: propiedades) {
            if (tipo != null && propiedades.getTipo() == tipo) {
                System.out.println(propiedades.toString());
            }
        }
		
	}
	
	public void mostrarPropiedades1 (){
		
		for (Propiedad propiedades: propiedades) {
            
                System.out.println(propiedades.toString());
            
        }
		
	}

}


/*

*/