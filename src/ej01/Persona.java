package ej01;

public class Persona {
		
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private int dni;
	
	public Persona(String nombre, String apellido, int dni, Domicilio domicilio) {
		nombre           = "";
		apellido         = "";
		dni              =  0;
		domicilio = null;
		}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	private void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	private void setDni() {
		dni = this.dni;
	}
	
	public String getNombre() {
				
		return this.nombre;
	}
	
	public String getApellido() {
		
		
		return this.apellido;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	public int getDni() {
		return this.dni;
	}

	
	public void mostrar() {
		System.out.println(this);
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", dni=" + dni
				+ "]";
	}

	
	
}
