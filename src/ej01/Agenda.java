package ej01;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Persona> personas;

	public Agenda() {
		this.personas = new ArrayList<Persona>();
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	private void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
	
	private Persona buscarPersona(int dniBuscar) {
		
		Persona persona;
		Persona personaEncontrada = null;
		int                     i = 0;
		
		while(i < this.personas.size() && personaEncontrada == null) {
			
			persona = this.personas.get(i);
			
			if(persona.getDni() == dniBuscar) {
				personaEncontrada = persona;
			}else
				i++;
		}
		return personaEncontrada;
		
	}

	public boolean agregarPersona(String nombreAgregar, String apellidoAgregar, int dniAgregar, Domicilio domicilio) {
		
		Persona personaAgregada;
		boolean resultado = false;
		
		personaAgregada = this.buscarPersona(dniAgregar);
		
		if(personaAgregada == null) {
			
			Persona personaAgregada1 = new Persona(nombreAgregar, apellidoAgregar, dniAgregar, domicilio);
			
			resultado = this.personas.add(personaAgregada1);
		}
		return resultado;
	}

	public Persona removerPersona(int dniRemover) {
		
		Persona personaRemovida = null;
		
		personaRemovida = this.buscarPersona(dniRemover);
		
		if(personaRemovida != null) {
			
			this.personas.remove(personaRemovida);
		}
		return personaRemovida;
	}

	public boolean modificarDomicilio(int dniModificar, Domicilio domicilio) {
		
		boolean resultado = false;
		Persona personaCambioDomicilio;
		
		personaCambioDomicilio = this.buscarPersona(dniModificar);
		
		if(personaCambioDomicilio != null) {
			
			resultado = this.modificarDomicilio(dniModificar, domicilio);
			
		}
		return resultado;
	}

	public void listarPersonas() {
		
		for (Persona persona : this.personas) {
			
			System.out.println(persona.toString());
		}
	}

	public void devolverUltimo () {
		
		Persona personaUltima;
		
		personaUltima = this.personas.size();
	}
	
	public void eliminarTodosAMano() {
		
		Persona personaEliminada;
		
		personaEliminada = this.personas.size(0);
		
		personaEliminada = this.personas.remove(0);
	}
	
	
}
