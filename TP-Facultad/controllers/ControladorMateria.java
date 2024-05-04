package controllers;

import java.util.*;

import model.Curso;
import model.Materia;

/**
 * 
 */
public class ControladorMateria {
	private List<Materia> materias= new ArrayList<Materia>();
	int contador=1;
	/**
     * Default constructor
     */
    public ControladorMateria() {
    }

    /**
     * @param Materia materia 
     * @return
     */
    
    public Materia crearMateria(String NombreMateria,boolean correlatividad) {
    	/* pregunta va a tener que recibir tambien la carrera ? o la carga maxima horaria? */
    	
    	
    	/*el contador es el codigo de materia*/
    	Materia materia = new Materia(contador,NombreMateria,correlatividad);
    	contador++;
    	materias.add(materia);
    	
    	return materia;
    }
    
    public Materia crearMateria(String NombreMateria,boolean correlatividad,Materia correlativaAnterior) {
    	/* pregunta va a tener que recibir tambien la carrera ? o la carga maxima horaria? */
    	
    	
    	/*el contador es el codigo de materia*/
    	Materia materia = new Materia(contador,NombreMateria,correlatividad,correlativaAnterior);
    	contador++;
    	materias.add(materia);
    	
    	return materia;
    }
    
    
    public List<Curso> obtenerCursos( Materia materia) {
        // TODO implement here
        return null;
    }
   
}