package model;

import java.util.*;


public class Materia {

    private int codigoMateria;
    private String nombreMateria;
    private boolean esCorrelativa;
    private int cargaHorariaMat;


	public Materia(int codigoMateria, String nombreMateria, boolean esCorrelativa) {
		super();
		this.codigoMateria = codigoMateria;
		this.nombreMateria = nombreMateria;
		this.esCorrelativa = esCorrelativa;
		this.cargaHorariaMat = 4;
	}




	public int getCargaHorariaMat() {
		return cargaHorariaMat;
	}
	
    
    
}