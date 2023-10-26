package ej02;

public class Empleado {
	
	private String nombreE;

	public Empleado(String nombreE) {
		this.nombreE = nombreE;
	}

	public String getNombreE() {
		return nombreE;
	}

	private void setNombreE(String nombreE) {
		this.nombreE = nombreE;
	}

	
	@Override
		public String toString() {
		return "Empleado [nombreE=" + nombreE + "]";
	}
	
	

}
