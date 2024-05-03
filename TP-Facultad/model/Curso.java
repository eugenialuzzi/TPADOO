package model;

import java.util.*;

/**
 * 
 */
public class Curso {

    private int idCurso;
    private Date horario;
    private Aula aula;
    private List<Materia> materias;
    
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public Curso(int idCurso, Date horario, Aula aula) {
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

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
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
    	System.out.println("se agrego la materia " + materia.getNombreMateria() + " a al curso ID: " + idCurso + " aula numero: " + aula.getNumeroAula());
    }
	
	
	

}