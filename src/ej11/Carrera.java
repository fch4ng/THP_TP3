package ej11;

import java.util.ArrayList;

public class Carrera {
	
	private int fecha;
	private int hora;
	private int cantidadDeVueltas;
	private ArrayList<Piloto> pilotos;
	
	
	public Carrera(int fecha, int hora, int cantidadDeVueltas) {
		setFecha(fecha);
		setHora(hora);
		setCantidadDeVueltas(cantidadDeVueltas);
	}
	public int getFecha() {
		return fecha;
	}
	public int getHora() {
		return hora;
	}
	public int getCantidadDeVueltas() {
		return cantidadDeVueltas;
	}
	public ArrayList<Piloto> getPilotos() {
		return pilotos;
	}
	private void setFecha(int fecha) {
		this.fecha = fecha;
	}
	private void setHora(int hora) {
		this.hora = hora;
	}
	private void setCantidadDeVueltas(int cantidadDeVueltas) {
		this.cantidadDeVueltas = cantidadDeVueltas;
	}
	private void setPilotos(ArrayList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	
	
	
	

}
