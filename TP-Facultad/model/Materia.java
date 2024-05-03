package model;

import java.util.*;


public class Materia {

    private int codigoMateria;
    private String nombreMateria;
    private boolean esCorrelativa;
    private int cargaHorariaMat;
    private Materia materiaCorrelativaAnterior;
    
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
	
	
	
    
    
}