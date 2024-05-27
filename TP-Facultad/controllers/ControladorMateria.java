package controllers;

import java.util.*;

import model.Curso;
import model.Materia;


public class ControladorMateria {
	
	private static ControladorMateria instance;
	
	private ControladorMateria() { 
		
	}
	
	private List<Materia> materias= new ArrayList<Materia>();
	int contador=1;
	
	 public static ControladorMateria getInstance() {

	        if (instance == null) {

	            instance = new ControladorMateria();

	        }

	        return instance;

	    }


   
    
    public Materia crearMateria(String NombreMateria,boolean correlatividad) {
    	Materia materia = new Materia(contador,NombreMateria,correlatividad);
    	contador++;
    	materias.add(materia);
    	
    	return materia;
    }
    
    public Materia crearMateria(String NombreMateria,boolean correlatividad,Materia correlativaAnterior) {
    	Materia materia = new Materia(contador,NombreMateria,correlatividad,correlativaAnterior);
    	contador++;
    	materias.add(materia);
    	
    	return materia;
    }
    

    ControladorCurso controladorCurso = ControladorCurso.getInstance();
    
	public List<Curso> obtenerCursos( Materia materia) {
    	List<Curso> CursosDeUnaMateria=new ArrayList<Curso>();
    	controladorCurso.buscarCursosDeUnaMateria(materia);
        return CursosDeUnaMateria;
    }



	public void getCantidadInscriptosPorCurso(){

		for(Materia materia:materias){
			List<Curso> cursos = new ArrayList<Curso>();
			
			cursos = controladorCurso.buscarCursosDeUnaMateria(materia);
			if(cursos.size() == 0){
				continue;
			}
			System.out.println("Para la materia: " + materia.getNombreMateria());
			for(Curso curso:cursos){
				curso.getcantidadDeInscriptos();
				System.out.println("La cantidad de inscriptos del curso: " + curso.getIdCurso() + " es: " + curso.getcantidadDeInscriptos());
			}
		}
	}

	public void getCursosDisponibles(Materia materia) {

		if(materia.getCursosDisponibles() == null){
			System.out.println("No hay cursos disponibles");
		}

	}
   

}