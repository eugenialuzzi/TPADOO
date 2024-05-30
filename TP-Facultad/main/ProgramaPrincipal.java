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
import controllers.ControladorPago;
import model.Aula;
import model.Carrera;
import model.CronogramaDocente;
import model.Curso;
import model.DiaSemana;
import model.Docente;
import model.Estudiante;
import model.Facultad;
import model.Informe;
import model.Materia;
import model.Turno;
import model.FactoryMethod.FactoryInforme;
import interfaces.TurnoMañana;
import interfaces.TurnoTarde;
import interfaces.TurnoNoche;
import interfaces.TurnoInterface;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		ControladorCarrera controladorCarrera = ControladorCarrera.getInstance();
		ControladorMateria controladorMateria = ControladorMateria.getInstance();
		ControladorDocente controladorDocente = ControladorDocente.getInstance();
		ControladorEstudiante controladorEstudiante =ControladorEstudiante.getInstance();  /*probar despues
		/*Carrera carrera1 = new Carrera("Ingenieria en Sistemas"); */
		ControladoInscripcion controladorInscripcion = ControladoInscripcion.getInstance();
		ControladorPago controladorPago = ControladorPago.getInstance();
		
		ControladorCurso controladorCurso = ControladorCurso.getInstance();
		
		Carrera carrera1=controladorCarrera.crearCarrera("Ingenieria en Sistemas");
		
		/*Carrera carrera2 = new Carrera("Derecho");*/
		Carrera carrera2=controladorCarrera.crearCarrera("Derecho");
		
		/*Carrera carrera3 = new Carrera("Ingenieria Quimica");*/
		Carrera carrera3=controladorCarrera.crearCarrera("Ingenieria Quimica");
		
		
		List<Materia> materias = new ArrayList<>();
		
		Materia materia;
		materia=controladorMateria.crearMateria("Analisis Matematico", false, 15000);
	    /*materias.add(new Materia(3400,"Analisis Matematico", true));*/
	    materias.add(materia);
		
	    materia=controladorMateria.crearMateria("Programacion", false, 20000);
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
		Docente docente3 = controladorDocente.crearDocente("Alberto", "Perez");
		
		System.out.println(" ");
		Aula aula1 = new Aula (123, 50);
		Aula aula2 = new Aula (756, 50);
		
		List<Curso> cursos = new ArrayList<>();
		
		TurnoInterface turno1 = new TurnoMañana();
        TurnoInterface turno2 = new TurnoTarde();
        TurnoInterface turno3 = new TurnoNoche();	

		Curso curso1= controladorCurso.crearCurso(3456, DiaSemana.LUNES, aula1, turno1);
		Curso curso2 = controladorCurso.crearCurso(3987,DiaSemana.JUEVES, aula1, turno2);
		Curso curso3= controladorCurso.crearCurso(1441, DiaSemana.LUNES, aula1, turno2);

		
		System.out.println();
		cursos.add(curso1);
		cursos.add(curso2);
		
		controladorCurso.agregarListMateria(materias, curso1);
		controladorCurso.agregarListMateria(materias, curso2);
		System.out.println(" ");
		
		controladorDocente.agregarCursoADocente(cursos, docente);
		

		
		System.out.println("el aula del curso1 es "+curso1.getAula() + " y su capacidad es "+curso1.getAula().getCapacidadMax());
		;
		System.out.println("");
		
		
		
		System.out.println("su capacidad es "+controladorCurso.verCapacidadAula(curso1));
		
		
		//creo las materias para ing en sistemas(carrera1)
		
		Materia mat1=controladorMateria.crearMateria("fisica 1",false,null, 10000);
		materias.clear();
		materias.add(mat1);
		//fisica dos tiene correlativa para ing en sistemas, pero no para derecho
		Materia mat2=controladorMateria.crearMateria("fisica 2",true,mat1, 12000);//fisica 2 para ing en sistemas
		materias.add(mat2);
		controladorCarrera.agregarMateria(materias,carrera1);
	
		
		materias.clear();
		Materia mat3=controladorMateria.crearMateria("filosofia",false,null, 10000);
		Materia mat4=controladorMateria.crearMateria("fisica 1",false,null,10000);
		Materia mat5=controladorMateria.crearMateria("fisica 2",false,null,12000);
		materias.add(mat3);
		materias.add(mat4);
		materias.add(mat5);
		controladorCarrera.agregarMateria(materias,carrera2);
		System.out.println(" ");
		
		controladorInscripcion.inscribir(estudiante, mat2,curso1);
		/*System.out.println("el estudiante es "+estudiante.getApellido()+ " "+estudiante.getNombre());*/
		controladorInscripcion.inscribir(estudiante, mat1,curso2);
		
		/* hacer paquetes de materias de primer año */
		/*mat1.setCosto(50000.0);*/
		controladorInscripcion.calcularMonto(estudiante);
		
		controladorPago.seleccionarMedioDePago();
		
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
        System.out.println("");
        System.out.println("otro intento");
        
        cronograma = controladorDocente.cronogramaSemanal(2);
       CronogramaDocente cronogramaDocente=new CronogramaDocente();
       cronogramaDocente.imprimirCronogramaDocente(cronograma);
		// Informes
       System.out.println("");
		
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

		
		
		System.out.println("aca le asigno un turno noche a un curso");
		TurnoInterface turno=new TurnoMañana();
		curso1.setTurno(turno1);


		controladorDocente.crearCursoPotencial(3, DiaSemana.LUNES, turno2, 16);
		controladorDocente.crearCursoPotencial(3, DiaSemana.SABADO, turno, 16);
		controladorDocente.compararPreferenciasDocentes(docente3, curso3);

		System.out.println("Tamaño de la lista: " + controladorDocente.buscarDocentePorSuId(3).getCursoPreferencial().size());

		
		
		cronogramaDocente.imprimirCronogramaDocente(cronogramaDocente.crearCronogramaSemanal(3));
		

		
		System.out.println(" fin");
		// TODO Auto-generated method stub
		
	}

    

	}


