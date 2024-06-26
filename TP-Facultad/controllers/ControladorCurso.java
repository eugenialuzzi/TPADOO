package controllers;

import java.util.*;

import interfaces.TurnoInterface;

import java.time.LocalTime;

import model.Aula;
import model.Carrera;
import model.Curso;
import model.DiaSemana;
import model.Materia;
import model.Turno;
import interfaces.TurnoInterface;


public class ControladorCurso {
	 
	private static ControladorCurso instance;
	 private ControladorCurso() {
	    }

	    public static ControladorCurso getInstance(){
	    	if(instance==null) {
	    		instance=new ControladorCurso();
	    	}
	    	return instance;
	    }
	
	
	private List<Materia> materias = new ArrayList<Materia>();
	
	private List<Curso> cursos= new ArrayList<Curso>();
	
	
   
    public Curso crearCurso(int idCurso, DiaSemana diaSemana, Aula aula,  TurnoInterface turno) {
    	Curso curso = new Curso(idCurso, diaSemana, aula, turno);
    	cursos.add(curso);
    	return curso;
    	
    }

	   
    public Curso crearCursoPotencial(int idCurso, DiaSemana diaSemana, Aula aula, TurnoInterface turno) {
    	Curso curso = new Curso(idCurso, diaSemana, aula, turno);
    	
    	return curso;
    	
    }
    
    public void asignarUnTurnoEspecialACurso(int idCurso , TurnoInterface turnoInterface) {
    	
    	buscarCursoPorSuId(idCurso).setTurno(turnoInterface);
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
	
 
    public Curso buscarCursoPorSuId(int idCursoBuscado) {
    	
    	for (Curso curso:cursos) {
    		int idActual=curso.getIdCurso();
    		if(idActual== idCursoBuscado) {
    			
    			return curso;
    		}
    		else {continue;
    			
    		}
    	}
    	System.out.println("no se encontro un curso con esa id");
    	return null;
    }
    
    public List<Curso> buscarCursosDeUnaMateria(Materia materia) {
    	List<Curso> listaResultado=new ArrayList<Curso>();
 
    	for(Curso cursoActual:cursos) {
    		List<Materia> materiasDelCurso=new ArrayList<Materia>();
    	
    		materiasDelCurso.addAll(cursoActual.getMaterias());
    		if (materiasDelCurso.size()==0)
    			continue;
    		for (Materia materiaActual:materiasDelCurso) {
    			if(materiaActual==materia) {
    				listaResultado.add(cursoActual);
    			}
    		}
    	}
    	return listaResultado;
    }
    
    
}