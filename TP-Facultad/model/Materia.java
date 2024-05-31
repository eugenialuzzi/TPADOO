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
	private Double costo;


	public Materia(int codigoMateria, String nombreMateria, boolean esCorrelativa, double costo, int cargaHorariaMat) {
		this.codigoMateria = codigoMateria;
		this.nombreMateria = nombreMateria;
		this.esCorrelativa = esCorrelativa;
		this.cargaHorariaMat = cargaHorariaMat ;
		this.costo = costo;
	}
	
	public Materia(int codigoMateria, String nombreMateria, boolean esCorrelativa,Materia correlativaanterior, double costo,int cargaHorariaMateria) {
		this.codigoMateria = codigoMateria;
		this.nombreMateria = nombreMateria;
		this.esCorrelativa = esCorrelativa;
		this.cargaHorariaMat = cargaHorariaMateria;
		this.materiaCorrelativaAnterior=correlativaanterior;
		this.costo = costo;
	}

	public void setCosto(Double costo){
		this.costo = costo;
	}

	public Double getCosto(){
		return costo;
	}
    
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


	public void setEsCorrelativa(boolean esCorrelativa) {
		this.esCorrelativa = esCorrelativa;
	}

	public void setCargaHorariaMat(int cargaHorariaMat) {
		this.cargaHorariaMat = cargaHorariaMat;
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

	
	
	public List<Curso> getCursosDisponibles(){
		List<Curso> cursosDisponibles = new ArrayList<>();
		for (Curso c:cursosDeLaMateria) {
			if (c.tieneVacante(c)) {
				cursosDisponibles.add(c);
				System.out.println("el curso" + c.getIdCurso() +
						"de los dias"  +c.getTurno().horaInicio()+" a "+c.getTurno().horaFin() + " " + 
						c.getDiaSemana() + "tiene vacantes");
			}
		}
		return cursosDisponibles;
	}
	
	public boolean isEsCorrelativa() {
		return esCorrelativa;
	}

	@Override
	public String toString() {
		return "Materia [codigoMateria=" + codigoMateria + ", nombreMateria=" + nombreMateria + ", esCorrelativa="
				+ esCorrelativa + ", cargaHorariaMat=" + cargaHorariaMat + ", materiaCorrelativaAnterior="
				+ materiaCorrelativaAnterior + ", materiaCorrelativaSiguiente=" + materiaCorrelativaSiguiente
				+ ", cursosDeLaMateria=" + cursosDeLaMateria + ", costo=" + costo + "]";
	}


    
    
}