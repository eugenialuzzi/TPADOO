package model;

import java.util.*;


public class Materia {

    private int codigoMateria;
    private String nombreMateria;
    private boolean esCorrelativa;
    private int cargaHorariaMat;
    private Materia materiaCorrelativaAnterior;
    private Materia materiaCorrelativaSiguiente;
    private List<Curso> cursosDeLaMateria;
    
	public int getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(int codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public boolean isEsCorrelativa() {
		return esCorrelativa;
	}

	public void setEsCorrelativa(boolean esCorrelativa) {
		this.esCorrelativa = esCorrelativa;
	}

	public void setCargaHorariaMat(int cargaHorariaMat) {
		this.cargaHorariaMat = cargaHorariaMat;
	}

	public Materia(int codigoMateria, String nombreMateria, boolean esCorrelativa) {
		/*super(); */
		this.codigoMateria = codigoMateria;
		this.nombreMateria = nombreMateria;
		this.esCorrelativa = esCorrelativa;
		this.cargaHorariaMat = 4;
	}
	
	public Materia(int codigoMateria, String nombreMateria, boolean esCorrelativa,Materia correlativaanterior) {
		/*super(); */
		this.codigoMateria = codigoMateria;
		this.nombreMateria = nombreMateria;
		this.esCorrelativa = esCorrelativa;
		this.cargaHorariaMat = 4;
		this.materiaCorrelativaAnterior=correlativaanterior;
	}

	

	public int getCargaHorariaMat() {
		return cargaHorariaMat;
	}

	public Materia getMateriaCorrelativaAnterior() {
		return materiaCorrelativaAnterior;
	}

	public void setMateriaCorrelativaAnterior(Materia materiaCorrelativaAnterior) {
		this.materiaCorrelativaAnterior = materiaCorrelativaAnterior;
	}
	
	
	public Materia getMateriaCorrelativaSiguiente() {
		return materiaCorrelativaSiguiente;
	}

	public void setMateriaCorrelativaSiguiente(Materia materiaCorrelativaSiguiente) {
		this.materiaCorrelativaSiguiente = materiaCorrelativaSiguiente;
	}
	  
	/*
	 revisar si es necesario
	public void getTodosLosCursosDeLaMateria() {
		for (Curso c:cursosDeLaMateria) {
			System.out.print("el id es: "+ +"se dicta el dia");
			c.getIdCurso();
			c.getDiaSemana();
			c.getHorario();
			c.getAula();
			c.getcantidadDeInscriptos();
			
		}
		
	*/
	
	public void getCursosDisponibles() {
		for (Curso c:cursosDeLaMateria) {
			if (c.tieneVacante(c)) {
				System.out.println("el curso" + c.getIdCurso() +
						"de los dias" + c.getHorario() + " " + 
						c.getDiaSemana() + "tiene vacantes");
			}
		}
	}

	@Override
	public String toString() {
		return "Materia [codigoMateria=" + codigoMateria + ", nombreMateria=" + nombreMateria + ", esCorrelativa="
				+ esCorrelativa + ", cargaHorariaMat=" + cargaHorariaMat + ", materiaCorrelativaAnterior="
				+ materiaCorrelativaAnterior + ", materiaCorrelativaSiguiente=" + materiaCorrelativaSiguiente
				+ ", cursosDeLaMateria=" + cursosDeLaMateria + "]";
	}

	
    
    
}