package ej01;

public class Domicilio {
	
	private String calle;
	private String numero;
	private String ciudad;
	
	public Domicilio(String calle, String numero) {
		setCalle(calle);
		setNumero(numero);
		
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

	public String getDomicilio() {
		
		
		return calle +" "+ numero +" "+ ciudad;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + "]";
	}

	
}
