package ej02;

public class Test {

	public static void main(String[] args) {
		
		//voy a crear 10 empleados 5 oficinas y 2 areas para testear
		
		Empleado empleado0 = new Empleado("Abel");
		Empleado empleado1 = new Empleado("Beto");
		Empleado empleado2 = new Empleado("Cain");
		Empleado empleado3 = new Empleado("Diego");
		Empleado empleado4 = new Empleado("Estefy");
		Empleado empleado5 = new Empleado("Fran");
		Empleado empleado6 = new Empleado("George");
		Empleado empleado7 = new Empleado("Hector");
		Empleado empleado8 = new Empleado("Ian");
		Empleado empleado9 = new Empleado("Juan");
		
		Oficina oficina0 = new Oficina("0");
		oficina0.setEmpleado(empleado0);
		
		Oficina oficina1 = new Oficina("1");
		oficina1.setEmpleado(empleado1);
		
		Oficina oficina2 = new Oficina("2");
		oficina2.setEmpleado(empleado2);
		
		Oficina oficina3 = new Oficina("3");
		oficina3.setEmpleado(empleado3);
		
		Oficina oficina4 = new Oficina("4");
		oficina4.setEmpleado(empleado4);
		
		Area area0 = new Area("0");
		area0.getOficinas().add(oficina0);
		area0.getOficinas().add(oficina1);
		
		Area area1 = new Area("1");
		area1.getOficinas().add(oficina2);
		area1.getOficinas().add(oficina3);
		area1.getOficinas().add(oficina4);
		
		Compania companiaNueva = new Compania("Acme");
		companiaNueva.getAreas().add(area0);
		companiaNueva.getAreas().add(area1);
		
		companiaNueva.listarAreas();
	}

}
