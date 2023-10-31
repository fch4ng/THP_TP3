package ej03;

public class Propiedad {
	
	private String domicilio;
	private int precio;
	private Tipo tipo;
	
	public Propiedad(String domicilio, int precio, Tipo tipo) {
		setDomicilio(domicilio);
		setPrecio(precio);
	}
	
	private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	private void setPrecio(int precio) {
		this.precio = precio;
	}
	
	private void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	@Override
	public String toString() {
		return "Propiedad [domicilio=" + domicilio + ", precio=" + precio + "]";
	}

}
