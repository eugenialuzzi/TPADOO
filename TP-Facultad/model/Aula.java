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
		super();
		this.numeroAula = numeroAula;
		this.capacidadMax = capacidadMax;
	}

  

    @Override
	public String toString() {
		return "Aula [Numero de aula=" + numeroAula + ", Capacidad maxima=" + capacidadMax + "]";
	}

}