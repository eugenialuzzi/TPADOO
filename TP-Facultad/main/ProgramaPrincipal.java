package main;
import java.util.ArrayList;
import java.util.List;

import controllers.ControladoInscripcion;
import controllers.ControladorCarrera;
import controllers.ControladorDocente;
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
		ControladorDocente controladorDocente = new ControladorDocente();
		ControladorEstudiante controladorEstudiante = new ControladorEstudiante();  /*probar despues*/
		ControladoInscripcion controladorInscripcion = new ControladoInscripcion();
		
		/*Carrera carrera1 = new Carrera("Ingenieria en Sistemas"); */
		Carrera carrera1=controladorCarrera.crearCarrera("Ingenieria en Sistemas");
		
		/*Carrera carrera2 = new Carrera("Derecho");*/
		Carrera carrera2=controladorCarrera.crearCarrera("Derecho");
		
		/*Carrera carrera3 = new Carrera("Ingenieria Quimica");*/
		Carrera carrera3=controladorCarrera.crearCarrera("Ingenieria Quimica");
		
		//---------agrego las materias a las carreras!!
		
		List<Materia> materias = new ArrayList<>();
		
		//creo las materias para ing en sistemas(carrera1)
		
		Materia mat1=controladorMateria.crearMateria("fisica 1",false,null);
		materias.add(mat1);
		//fisica dos tiene correlativa para ing en sistemas, pero no para derecho
		Materia mat2=controladorMateria.crearMateria("fisica 2",true,mat1);//fisica 2 para ing en sistemas
		materias.add(mat2);
		
	    controladorCarrera.agregarMateria(materias,carrera1);
	    materias.clear();
	    
	  //creo las materias apra derecho(carrera2)
		
	    Materia mat3=controladorMateria.crearMateria("fisica 1",false,null);
	  	materias.add(mat3);
	  	//fisica dos tiene correlativa para ing en sistemas, pero no para derecho
	  	Materia mat4=controladorMateria.crearMateria("fisica 2",false,null);
	  	materias.add(mat4);
	  	
	    controladorCarrera.agregarMateria(materias,carrera2);
	    materias.clear();
	  	
	    System.out.println(" ");
	    
	    //creamos los estudiantes
	    Estudiante estudiante;
		/*Estudiante estudiante1 = new Estudiante("Maria", "Luzzi", 1234, true, carrera1);*/
	    Estudiante estudiante1=controladorEstudiante.crearEstudiante("Maria", "Luzzi", true, carrera1);
		
	    Estudiante estudiante2=controladorEstudiante.crearEstudiante("Agustina","Cafiero", true, carrera2); 
		/* Estudiante estudiante2 = new Estudiante("Agustina", "Cafiero", 2234, true, carrera2); */
		
	    Estudiante estudiante3=controladorEstudiante.crearEstudiante("Yancamil", "Gomez Lopez", true, carrera3);
		/*Estudiante estudiante3 = new Estudiante("Yancamil", "Gomez Lopez", 7654, true, carrera3);*/
		
	    Estudiante estudiante4=controladorEstudiante.crearEstudiante("Jose", "Sparks", true, carrera1);
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
		

		Aula aula = new Aula (123, 50);
		
		System.out.println(" ");
		
		// TODO Auto-generated method stub
		System.out.println(" ");
		//aca se anotan los estudiantes a las materias, chequeamos correlativas
		estudiante1= controladorInscripcion.inscribir(estudiante1,mat2);   //no deberia poder anotarlo xq el estudiante 1 no tiene fisica1 cursada
		System.out.println(" ");
		estudiante1=controladorInscripcion.inscribir(estudiante1,mat1);  //lo anoto en f1
		System.out.println(" ");
		//ahora si me deberia debjar anotarlo en f2:
		
		controladorEstudiante.AgregarMateriaAprobadaALista(estudiante1, mat1);
		
		
		estudiante1=controladorInscripcion.inscribir(estudiante1,mat2);   //no deberia poder anotarlo xq el estudiante 1 no tiene fisica1 cursada
		System.out.println(" fin");
	}

	
}
