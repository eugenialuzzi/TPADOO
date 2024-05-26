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
    
    ///ControladorCurso controladorCurso = new ControladorCurso();
    ControladorCurso controladorCurso = ControladorCurso.getInstance();
    public List<Curso> obtenerCursos( Materia materia) {
    	List<Curso> CursosDeUnaMateria=new ArrayList<Curso>();
    	controladorCurso.buscarCursosDeUnaMateria(materia);
        return CursosDeUnaMateria;
    }
   
}