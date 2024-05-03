package main;
import java.util.ArrayList;
import java.util.List;

import controllers.ControladorCarrera;
import controllers.ControladorEstudiante;
import controllers.ControladorMateria;
import model.Aula;
import model.Carrera;
import model.Docente;
import model.Estudiante;
import model.Materia;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		ControladorCarrera controladorCarrera = new ControladorCarrera();
		ControladorMateria controladorMateria = new ControladorMateria();
		ControladorEstudiante controladorEstudiante = new ControladorEstudiante();  /*probar despues
		
		/*Carrera carrera1 = new Carrera("Ingenieria en Sistemas"); */
		Carrera carrera1=controladorCarrera.crearCarrera("Ingenieria en Sistemas");
		
		/*Carrera carrera2 = new Carrera("Derecho");*/
		Carrera carrera2=controladorCarrera.crearCarrera("Derecho");
		
		/*Carrera carrera3 = new Carrera("Ingenieria Quimica");*/
		Carrera carrera3=controladorCarrera.crearCarrera("Ingenieria Quimica");
		
		
		List<Materia> materias = new ArrayList<>();
		
		Materia materia;
		materia=controladorMateria.crearMateria("Analisis Matematico", false);
	    /*materias.add(new Materia(3400,"Analisis Matematico", true));*/
	    materias.add(materia);
		
	    materia=controladorMateria.crearMateria("Programacion", false);
	    /*materias.add(new Materia(3500,"Programacion", false));*/
	    materias.add(materia);
	    
	    
	    controladorCarrera.agregarMateria(materias,carrera1);
		
	    System.out.println(" ");
	    
	    Estudiante estudiante;
		/*Estudiante estudiante1 = new Estudiante("Maria", "Luzzi", 1234, true, carrera1);*/
	    estudiante=controladorEstudiante.crearEtudiante("Maria", "Luzzi", true, carrera1);
		
	    estudiante=controladorEstudiante.crearEtudiante("Agustina","Cafiero", true, carrera2); 
		/* Estudiante estudiante2 = new Estudiante("Agustina", "Cafiero", 2234, true, carrera2); */
		
		estudiante=controladorEstudiante.crearEtudiante("Yancamil", "Gomez Lopez", true, carrera3);
		/*Estudiante estudiante3 = new Estudiante("Yancamil", "Gomez Lopez", 7654, true, carrera3);*/
		
		estudiante=controladorEstudiante.crearEtudiante("Jose", "Sparks", true, carrera1);
		/*Estudiante estudiante4 = new Estudiante("Jose", "Sparks", 9987, true, carrera1);*/
	
		/*
		estudiante1.setCarrera(carrera1);
		estudiante2.setCarrera(carrera2);
		estudiante3.setCarrera(carrera3);
		estudiante4.setCarrera(carrera1);
		*/
		Docente docente1 = new Docente ("Esteban", "Lamonte", 35);
		Docente docente2 = new Docente ("Carmen", "Lopez", 22);
		

		Aula aula = new Aula (123, 50);
		
		System.out.println(" ");
		System.out.println(" fin");
		// TODO Auto-generated method stub

	}


}
