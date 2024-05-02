package controllers;

import java.util.*;

import model.Carrera;
import model.Materia;

/**
 * 
 */
public class ControladorCarrera {

	private List<Materia> materias;
	
    public ControladorCarrera() {
    }

	public void agregarMateria(List<Materia> materias) {
	    this.materias.add((Materia) materias);
	}

    public Boolean validarCargaHorariaMax( Carrera carrera) {
        // TODO implement here
        return null;
    }

}