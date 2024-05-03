package model;

import java.util.*;

/**
 * 
 */
public class Curso {

   
	/**
     * Default constructor
     */
    public Curso() {
    }

    /**
     * 
     */
    private int idCurso;

    /**
     * 
     */
    private Date horario;
    
    private Docente docente;
    
    private Aula aula;
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

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

}