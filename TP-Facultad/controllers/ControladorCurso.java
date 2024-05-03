package controllers;

import java.util.*;

import model.Aula;
import model.Carrera;
import model.Curso;
import model.Materia;

/**
 * 
 */
public class ControladorCurso {

	private List<Materia> materias = new ArrayList<Materia>();
	
	private List<Curso> cursos= new ArrayList<Curso>();
	
	
    public ControladorCurso() {
    }

    public Curso crearCurso(int idCurso, Date horario, Aula aula) {
    	Curso curso = new Curso(idCurso, horario, aula);
    	cursos.add(curso);
    	return curso;
    	
    }
    
    
	public void agregarListMateria(List<Materia> materias, Curso curso) {
        for (Materia m : materias) {
        	curso.agregarMateriaACurso(m);
	}
	}
    
    public void recorrerCurso(Curso curso) {
        // TODO implement here
        
    }

}