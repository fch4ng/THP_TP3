package ej02;

public class Oficina {
	
	private String nombreO;
	private Empleado empleado;

	public Oficina(String nombreO) {
		this.nombreO = nombreO;
	}

	public String getNombreO() {
		return nombreO;
	}

	private void setNombreO(String nombreO) {
		this.nombreO = nombreO;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	

}
