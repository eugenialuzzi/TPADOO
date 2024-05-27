package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;

import controllers.ControladoInscripcion;
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
import model.Facultad;
import model.Informe;
import model.Materia;
import model.Turno;
import model.FactoryMethod.FactoryInforme;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		ControladorCarrera controladorCarrera = ControladorCarrera.getInstance();
		ControladorMateria controladorMateria = ControladorMateria.getInstance();
		ControladorDocente controladorDocente = ControladorDocente.getInstance();
		ControladorEstudiante controladorEstudiante =ControladorEstudiante.getInstance();  /*probar despues
		/*Carrera carrera1 = new Carrera("Ingenieria en Sistemas"); */
		ControladoInscripcion controladorInscripcion = ControladoInscripcion.getInstance();
		
		ControladorCurso controladorCurso = ControladorCurso.getInstance();
		
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
	    
	    Facultad facultad=new Facultad();
	    facultad.setNombreDeFacultad("Facultad de Ingenieria");
	    carrera1.setFacultad(facultad);
		facultad.setfechaLimite("2028-03-05");

		Facultad facultad2=new Facultad();
	    facultad2.setNombreDeFacultad("Facultad de Abogacia");
	    carrera2.setFacultad(facultad2);
		facultad2.setfechaLimite("2028-08-10");
	    
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

		Turno turnoMañana = new Turno("Mañana", LocalTime.of(7, 30,00) );
		Turno turnoTarde = new Turno("Tarde", LocalTime.of(14, 30,00));
		
		Curso curso1= controladorCurso.crearCurso(3456, DiaSemana.LUNES, LocalTime.of(18, 30,00), aula1, turnoMañana);
		Curso curso2 = controladorCurso.crearCurso(3987,DiaSemana.JUEVES, LocalTime.of(07, 45,00), aula1, turnoTarde);
		
		
	
		cursos.add(curso1);
		cursos.add(curso2);
		
		controladorCurso.agregarListMateria(materias, curso1);
		controladorCurso.agregarListMateria(materias, curso2);
		System.out.println(" ");
		
		controladorDocente.agregarCursoADocente(cursos, docente);
		

		
		System.out.println("el aula del curso1 es "+curso1.getAula() + " y su capacidad es "+curso1.getAula().getCapacidadMax());
		;
		System.out.println("");
		System.out.println("tiene vacante?"+controladorCurso.tieneVacante(curso1));
		
		
		System.out.println("su capacidad es "+controladorCurso.verCapacidadAula(curso1));
		
		
		//creo las materias para ing en sistemas(carrera1)
		
		Materia mat1=controladorMateria.crearMateria("fisica 1",false,null);
		materias.clear();
		materias.add(mat1);
		//fisica dos tiene correlativa para ing en sistemas, pero no para derecho
		Materia mat2=controladorMateria.crearMateria("fisica 2",true,mat1);//fisica 2 para ing en sistemas
		materias.add(mat2);
		controladorCarrera.agregarMateria(materias,carrera1);
	
		
		materias.clear();
		Materia mat3=controladorMateria.crearMateria("filosofia",false,null);
		Materia mat4=controladorMateria.crearMateria("fisica 1",false,null);
		Materia mat5=controladorMateria.crearMateria("fisica 2",false,null);
		materias.add(mat3);
		materias.add(mat4);
		materias.add(mat5);
		controladorCarrera.agregarMateria(materias,carrera2);
		System.out.println(" ");
		
		controladorInscripcion.inscribir(estudiante, mat2,curso1);
		/*System.out.println("el estudiante es "+estudiante.getApellido()+ " "+estudiante.getNombre());*/
		controladorInscripcion.inscribir(estudiante, mat1,curso2);
		
		/* hacer paquetes de materias de primer año */
		mat1.setCosto(50000.0);
		controladorInscripcion.calcularMonto(estudiante);
		
		List<Curso> cursosAsignados = controladorDocente.cursosAsignados(2);
		List<Curso> listaBackUp=new ArrayList();
		
				
		System.out.println(" ");
        // Mostrar los cursos asignados
        System.out.println("Cursos asignados al docente con ID " + 2 + ":");
        for (Curso curso : cursosAsignados) {
        	listaBackUp.add(curso);
            System.out.println("- Curso ID: " + curso.getIdCurso());
        }
        
        List<String> cronograma = controladorDocente.cronogramaSemanal(2);
		System.out.println(" ");
        System.out.println("Cronograma semanal del docente:");
        System.out.println("DIA " + " - "+ "CURSO "+ "- " + "HORARIO");

        for (String cursoInfo : cronograma) {
            System.out.println(cursoInfo);
        }  

        
       
		// Informes

		
		FactoryInforme factoryInforme = new FactoryInforme();
		 
		
		
		System.out.println(" back up");
		Informe informe = factoryInforme.crearInforme(docente.getIdDocente(), listaBackUp, 0);
		System.out.println(" resumen");
		factoryInforme.mostrarInformeResumido(informe);
		System.out.println(" et");
		/*
		System.out.println("segun el informe "+informe.getIdInforme());
		System.out.println(" el docente "+docente.getApellido()+" tiene ");
		
		for (Curso cursoActual: informe.getCursos()) {
			System.out.println(cursoActual.getIdCurso() +"     "+ cursoActual.getTurno());
		}
			
		*/
		/*System.out.println(informe);*/

		factoryInforme.exportar(informe);

		controladorMateria.getCantidadInscriptosPorCurso();
		
		
		
		System.out.println(" fin");
		// TODO Auto-generated method stub
		
	}


    

	}


