package main;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

import controllers.ControladorCarrera;
import controllers.ControladorCurso;
import controllers.ControladorDocente;
import controllers.ControladorEstudiante;
import controllers.ControladorMateria;
import model.Aula;
import model.Carrera;
import model.Curso;
import model.DiaSemana;
import model.Docente;
import model.Estudiante;
import model.Materia;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		ControladorCarrera controladorCarrera = new ControladorCarrera();
		ControladorMateria controladorMateria = new ControladorMateria();
		ControladorDocente controladorDocente = new ControladorDocente();
		ControladorEstudiante controladorEstudiante = new ControladorEstudiante();  /*probar despues
		/*Carrera carrera1 = new Carrera("Ingenieria en Sistemas"); */
		ControladorCurso controladorCurso = new ControladorCurso();
		
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
	    estudiante=controladorEstudiante.crearEstudiante("Maria", "Luzzi", true, carrera1);
		
	    estudiante=controladorEstudiante.crearEstudiante("Agustina","Cafiero", true, carrera2); 
		/* Estudiante estudiante2 = new Estudiante("Agustina", "Cafiero", 2234, true, carrera2); */
		
		estudiante=controladorEstudiante.crearEstudiante("Yancamil", "Gomez Lopez", true, carrera3);
		/*Estudiante estudiante3 = new Estudiante("Yancamil", "Gomez Lopez", 7654, true, carrera3);*/
		
		estudiante=controladorEstudiante.crearEstudiante("Jose", "Sparks", true, carrera1);
		/*Estudiante estudiante4 = new Estudiante("Jose", "Sparks", 9987, true, carrera1);*/
	
		/*
		estudiante1.setCarrera(carrera1);
		estudiante2.setCarrera(carrera2);
		estudiante3.setCarrera(carrera3);
		estudiante4.setCarrera(carrera1);
		*/
		/*Docente docente1 = new Docente ("Esteban", "Lamonte", 35);
		Docente docente2 = new Docente ("Carmen", "Lopez", 22);*/
		System.out.println(" ");
		Docente docente;
		docente = controladorDocente.crearDocente("Esteban", "Lamonte");
		docente = controladorDocente.crearDocente("Carmen", "Lopez");
		
		System.out.println(" ");
		Aula aula1 = new Aula (123, 50);
		Aula aula2 = new Aula (756, 50);
		
		List<Curso> cursos = new ArrayList<>();
		
		Curso curso1= controladorCurso.crearCurso(3456, DiaSemana.LUNES, LocalTime.of(18, 30,00), aula1);
		Curso curso2 = controladorCurso.crearCurso(3987,DiaSemana.JUEVES, LocalTime.of(07, 45,00), aula1);
		
		cursos.add(curso1);
		cursos.add(curso2);
		
		controladorCurso.agregarListMateria(materias, curso1);
		controladorCurso.agregarListMateria(materias, curso2);
		System.out.println(" ");
		
		controladorDocente.agregarCursoADocente(cursos, docente);
		
		List<Curso> cursosAsignados = controladorDocente.cursosAsignados(2);

        // Mostrar los cursos asignados
        System.out.println("Cursos asignados al docente con ID " + 2 + ":");
        for (Curso curso : cursosAsignados) {
            System.out.println("- Curso ID: " + curso.getIdCurso());
            System.out.println("- Dia: " + curso.getDiaSemana());
            System.out.println("  Horario: " + curso.getHorario());
            System.out.println("  Aula: " + curso.getAula());
        }
	

		System.out.println(" ");
		System.out.println(" fin");
		// TODO Auto-generated method stub
		
		

	}


}
