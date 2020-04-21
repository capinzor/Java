package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// Creacion de objetos tipo empleado
		Empleados Empleado = new DirectorEmpleado();
		
		// Uso de los objetos creados
		System.out.println(Empleado.getTareas());
		*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleados Camilo = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Camilo.getTareas());
		contexto.close();
		
	}

}
