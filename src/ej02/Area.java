package ej02;

import java.util.ArrayList;

import ej01.Persona;

public class Area {
	
	private String nombreA;
	private ArrayList<Oficina> oficinas;
	
	
	public Area(String nombreA) {
		this.nombreA = nombreA;
		this.oficinas = new ArrayList<Oficina>();
	}
	
	public void listarOficinas() {
		
		for (Oficina oficina : this.oficinas) {
			
			System.out.println(oficina.toString());
		}
	}

	
	public String getNombreA() {
		return nombreA;
	}

	
	public ArrayList<Oficina> getOficinas() {
		return oficinas;
	}

	
	private void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	private void setOficinas(ArrayList<Oficina> oficinas) {
		this.oficinas = oficinas;
	}

	

}
