package ej01;

public class Domicilio {
	
	private String calle;
	private String numero;
	private String ciudad;
	
	public Domicilio(String calle, String numero, String cuidad) {
		this.calle   = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getDomicilio() {
		
		
		return calle +" "+ numero +" "+ ciudad;
	}

}
