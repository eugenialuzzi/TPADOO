package controllers;

import java.util.*;

import model.Carrera;
import model.Materia;

/**
 * 
 */
public class ControladorCarrera {

	private List<Materia> materias= new ArrayList<Materia>();
	
    public ControladorCarrera() {
    }         
   
	public void agregarMateria(List<Materia> materia) {
		// Recorremos la lista de materiales que queremos agregar
        for (Materia m : materia) {
            this.materias.add(m);
	}
	}
    public Boolean validarCargaHorariaMax( Carrera carrera) {
        // TODO implement here
        return false;
    }

}