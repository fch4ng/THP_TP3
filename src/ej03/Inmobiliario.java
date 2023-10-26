package ej03;

import java.util.ArrayList;

public class Inmobiliario {

	private ArrayList<Barrio> barrios;
	
	

	public Inmobiliario(ArrayList<Barrio> barrios) {
		setBarrios(barrios);
	}

	private void setBarrios(ArrayList<Barrio> barrios) {
		this.barrios = barrios;
	}

	public ArrayList<Barrio> getBarrios() {
		return barrios;
	}
	
	public ArrayList<Propiedad> mostrarPropiedades (){
		
		//deveulve un arraylist de propiedades
		//mostrar la dirección y el precio de todas las propiedades que posea a la venta
		ArrayList<Propiedad> propiedadesEnVenta = new ArrayList<Propiedad>();
		
	return propiedadesEnVenta;	
	}
	
	public ArrayList<Barrio> obtenerBarrioMaxProp (){
		
		//deveulve un arraylist de barrios con mayor cantidad de propiedades
		//una lista de él o los barrios con la mayor cantidad de propiedades en cartera.
		ArrayList<Barrio> barriosMayorCantidadPropiedades = new ArrayList<Barrio>();
		
	return barriosMayorCantidadPropiedades;	
	} 
	
	public void cambiarPropiedadDeBarrio(String domicilioRecibido, Barrio barrio) {
		
		//mueva la propiedad asociada a ese domicilio al nuevo
		//barrio, removiéndola del barrio anterior.
	}
	
	public void borrarPropiedad (String domicilioABorrar) {
		
		//elimine la propiedad asociada a ese domicilio del barrio donde se encuentre
	}
}
