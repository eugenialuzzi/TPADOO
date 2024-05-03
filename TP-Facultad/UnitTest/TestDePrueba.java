package UnitTest;

import java.util.List;

import controllers.ControladorCarrera;
import controllers.ControladorEstudiante;
import model.Carrera;
import model.Estudiante;

public class TestDePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Carrera carrera1 = new Carrera("Ingenieria en Sistemas");
			Carrera carrera2 = new Carrera("Derecho");
			Carrera carrera3 = new Carrera("Ingenieria Quimica");

			Estudiante estudiante1 = new Estudiante("Maria", "Luzzi", 1234, true, carrera1);
			Estudiante estudiante2 = new Estudiante("Agustina", "Cafiero", 2234, true, carrera2);
			Estudiante estudiante3 = new Estudiante("Yancamil", "Gomez Lopez", 7654, true, carrera3);
			Estudiante estudiante4 = new Estudiante("Jose", "Sparks", 9987, true, carrera1);
			
	        
			ControladorCarrera controladorCarrera = new ControladorCarrera();

			ControladorEstudiante controladorEstudiante = ControladorEstudiante.getInstancia();
		
			controladorEstudiante.altaEstudiante(estudiante1);
		
			List<Estudiante> listaEstudiantes = controladorEstudiante.getListaEstudiantes();


        	System.out.println("Nuevo estudiante:");
        	System.out.println("NOMBRE: "+ controladorEstudiante.getListaEstudiantes().get(0).getNombre()  + " " + controladorEstudiante.getListaEstudiantes().get(0).getApellido());
        	System.out.println("DNI: " + controladorEstudiante.getListaEstudiantes().get(0).getIdEstudiante());
			 

			}
	

}
