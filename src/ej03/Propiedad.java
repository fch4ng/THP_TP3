package ej03;

public class Propiedad {
	
	private String domicilio;
	private int precio;
	
	public Propiedad(String domicilio, int precio) {
		setDomicilio(domicilio);
		setPrecio(precio);
	}
	
	private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	private void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	

}
