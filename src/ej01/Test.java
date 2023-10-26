package ej01;

import java.util.ArrayList;

public class Test {

	

	public static void main(String[] args) {
		
		
		Domicilio domicilio0 = new Domicilio("Yatay", "1234");
		Domicilio domicilio1 = new Domicilio("Belgrano", "1234");
		Domicilio domicilio3 = new Domicilio("Thames", "1234");
		
		Agenda personas = new Agenda();
		
		personas.agregarPersona("Francisco", "Chang", 94488885, domicilio0);
		
		personas.agregarPersona("Pau", "Espino", 12345678, domicilio1);
		
		personas.agregarPersona("Leo", "A", 147258369, domicilio3);
		
		personas.listarPersonas();
		
		System.out.println("3 personas agegadas exitosament");
		
		personas.removerPersona(135679);
		
		personas.listarPersonas();
		
		System.out.println("no se pudo remover a la personas");
		
		personas.removerPersona(94488885);
		
		personas.listarPersonas();
		
		System.out.println("persona removida exitosamente");
		
		personas.modificarDomicilio(13579, domicilio0);
		
		personas.listarPersonas();
		
		System.out.println("cambio de direccion no exitoso");
		
		personas.modificarDomicilio(123456789, domicilio1);
		
		personas.listarPersonas();
		
		
		

	}

}
