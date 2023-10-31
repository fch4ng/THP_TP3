package ej11;

public class Vuelta {
	
	private int tiempoObtenido;
	private int valorVueltaPromedio;
	
	public Vuelta(int tiempoObtenido, int valorVueltaPromedio) {
		setTiempoObtenido(tiempoObtenido);
		setValorVueltaPromedio(valorVueltaPromedio);
	}
	public int getTiempoObtenido() {
		return tiempoObtenido;
	}
	public int getValorVueltaPromedio() {
		return valorVueltaPromedio;
	}
	private void setTiempoObtenido(int tiempoObtenido) {
		this.tiempoObtenido = tiempoObtenido;
	}
	private void setValorVueltaPromedio(int valorVueltaPromedio) {
		this.valorVueltaPromedio = valorVueltaPromedio;
	}
	
	

}
