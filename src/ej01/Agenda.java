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

}
