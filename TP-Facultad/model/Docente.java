package model;

import java.util.*;
import java.time.LocalTime;

public class Docente {

    public Docente() {
    }

    private String nombre;
    private String apellido;
    private int idDocente;
    private List<Curso> cursos;

    public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

    public Docente(String nombre, String apellido, int idDocente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idDocente = idDocente;
		this.cursos = new ArrayList<>();
        System.out.println("se creo el docente: " + nombre + " " + apellido + ", id = " + idDocente);
	}

    

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getIdDocente() {
		return idDocente;
	}



	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}



	public List<Curso> getCursos() {
		return cursos;
	}



	public void agregaCursoADocente(Curso curso){
    	cursos.add(curso);
    	System.out.println("se agrego el curso " + curso.getIdCurso()  +" en el horario:  " + curso.getHorario() + " al docente: " + nombre);
    }
	
	

	@Override
	public String toString() {
		return "Docente [nombre=" + nombre + ", apellido=" + apellido + ", idDocente=" + idDocente
				+ ", cursosAsignados=" + /*listadoCursos +*/ "]";
	}

}