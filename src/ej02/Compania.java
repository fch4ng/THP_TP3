package ej02;

import java.util.ArrayList;

public class Compania {
	
	private String nombreC;
	private ArrayList<Area> areas;
	
	public Compania(String nombreC) {
		this.nombreC = nombreC;
		this.areas = new ArrayList<Area>();;
	}
	
	public void listarAreas() {
		
		for (Area area : this.areas) {
			
			System.out.println(area.toString());
		}
	}

	public String getNombreC() {
		return nombreC;
	}

	public ArrayList<Area> getAreas() {
		return areas;
	}

	private void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	private void setAreas(ArrayList<Area> areas) {
		this.areas = areas;
	}
	
	

}
