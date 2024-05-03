package model;

import java.util.*;

/**
 * 
 */
public class Aula {

    /**
     * Default constructor
     */
    public Aula() {
    }

    /**
     * 
     */
    private int numeroAula;

    /**
     * 
     */
    private int capacidadMax;


    public Aula(int numeroAula, int capacidadMax) {
		
		this.numeroAula = numeroAula;
		this.capacidadMax = capacidadMax;
	}

  

    @Override
	public String toString() {
		return "Aula [Numero de aula=" + numeroAula + ", Capacidad maxima=" + capacidadMax + "]";
	}



	public int getNumeroAula() {
		return numeroAula;
	}



	public void setNumeroAula(int numeroAula) {
		this.numeroAula = numeroAula;
	}



	public int getCapacidadMax() {
		return capacidadMax;
	}



	public void setCapacidadMax(int capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

}