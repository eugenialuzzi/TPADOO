package model;

import java.util.*;
import java.time.LocalTime;

public class Curso {

    private int idCurso;
    private LocalTime horario;
    private Aula aula;
    private List<Materia> materias;
    
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public Curso(int idCurso, LocalTime horario, Aula aula) {
		super();
		this.idCurso = idCurso;
		this.horario = horario;
		this.aula = aula;
		this.materias = new ArrayList<>();
	}


	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
    
	
	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}


	
	public List<Materia> getMaterias() {
        return materias;
    }
	
	public void agregarMateriaACurso(Materia materia){
    	materias.add(materia);
    	System.out.println("se agrego la materia " + materia.getNombreMateria() + " a al curso ID: " + idCurso + " aula numero: " + aula.getNumeroAula() +"en el horario: " + horario);
    }
	
	
	

}