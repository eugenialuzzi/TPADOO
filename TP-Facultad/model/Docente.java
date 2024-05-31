package model;

import java.util.*;

import controllers.ControladorCurso;

import java.time.LocalTime;

public class Docente {

    public Docente() {
    }

    private String nombre;
    private String apellido;
    private int idDocente;
    private List<Curso> cursos;
	private int horasMensualesAsignadas;
	private List<Curso> cursosPreferenciales=new ArrayList<Curso>();



    public Docente(String nombre, String apellido, int idDocente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idDocente = idDocente;
		this.cursos = new ArrayList<>();
        System.out.println("se creo el docente: " + nombre + " " + apellido + ", id = " + idDocente);
	}

    public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
    
	public List<Curso> getCursos() {
		return cursos;
	}


	public List<Curso> getCursoPreferencial(){
		return cursosPreferenciales;
	}
	
	public void setHorasMensualesAsignadas(int horasMensualesAsignadas) {
		this.horasMensualesAsignadas = horasMensualesAsignadas;
	}

	public int getHorasMensualesAsignadas() {
		calcularHorasAsignadas();
		return horasMensualesAsignadas;
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



	public int calcularHorasAsignadas(){
		
		int horas = 0;
		for(Curso curso:cursos){
			horas +=curso.getMaterias().get(0).getCargaHorariaMat();
			
			}
		setHorasMensualesAsignadas(horas);
		return horas;
	}

	public void agregaCursoADocente(Curso curso){
    	cursos.add(curso);
    	System.out.println("se agrego el curso " + curso.getIdCurso()  +" en el horario de  " + curso.getTurno().horaInicio()+ " a " +curso.getTurno().horaFin() + " al docente: " + nombre);
    }
	
	public void agregarCursoPreferencial(Curso cursoPreferencial){
		cursosPreferenciales.add(cursoPreferencial);
	}
	
	public void sacarCursoPreferencial(Curso cursoPreferencial){
		cursosPreferenciales.remove(cursoPreferencial);
	}
	

	@Override
	public String toString() {
		return "Docente [nombre=" + nombre + ", apellido=" + apellido + ", idDocente=" + idDocente
				+ ", cursosAsignados=" + /*listadoCursos +*/ "]";
	}

}