package ej06;

public class Cliente {
	
	private String dni;
	private String nombre;
	private Double saldoDeudor;
	Servicio servicio;
	
	
	public Cliente(String dni, String nombre, Double saldoDeudor, Servicio servicio) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldoDeudor = saldoDeudor;
		this.servicio = servicio;
	}


	public String getDni() {
		return dni;
	}


	public String getNombre() {
		return nombre;
	}


	public Double getSaldoDeudor() {
		return saldoDeudor;
	}


	public Servicio getServicio() {
		return servicio;
	}


	private void setDni(String dni) {
		this.dni = dni;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void setSaldoDeudor(Double saldoDeudor) {
		this.saldoDeudor = saldoDeudor;
	}


	private void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	public boolean esDeudor() {
		
		boolean esDeudor = false;
		
		return esDeudor;
	}
	
	

}
