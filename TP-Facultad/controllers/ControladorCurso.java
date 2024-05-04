package controllers;

import java.util.*;
import java.time.LocalTime;

import model.Aula;
import model.Carrera;
import model.Curso;
import model.DiaSemana;
import model.Materia;


public class ControladorCurso {

	private List<Materia> materias = new ArrayList<Materia>();
	
	private List<Curso> cursos= new ArrayList<Curso>();
	
	
    public ControladorCurso() {
    }

    public Curso crearCurso(int idCurso, DiaSemana diaSemana, LocalTime horario, Aula aula) {
    	Curso curso = new Curso(idCurso, diaSemana, horario, aula);
    	cursos.add(curso);
    	return curso;
    	
    }
    

    public Boolean tieneVacante(Curso curso) {
    	
    	return curso.tieneVacante(curso);
    }
    
	public void agregarListMateria(List<Materia> materias, Curso curso) {
        for (Materia m : materias) {
        	curso.agregarMateriaACurso(m);
	}	
        
	}
    

	public int verCapacidadAula(Curso curso) {
		int capacidad;
		capacidad=curso.getAula().getCapacidadMax();
		return capacidad;
	}
	
    public void recorrerCurso(Curso curso) {

	}
    public void recorrerCurso(List<Curso> cursos) {

        // TODO implement here
        
    }

}