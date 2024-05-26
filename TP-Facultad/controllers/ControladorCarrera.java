package controllers;

import java.util.*;

import model.Carrera;
import model.Materia;

/**
 * 
 */
public class ControladorCarrera {
	
private static ControladorCarrera instance;
	
	private ControladorCarrera () { 
		
	}
	
	 public static ControladorCarrera  getInstance() {

	        if (instance == null) {

	            instance = new ControladorCarrera ();

	        }

	        return instance;

	    }
	
	/* este controlador no tendria que tener una lista de materias creo*/
	private List<Materia> materias= new ArrayList<Materia>();
	
	private List<Carrera> Carreras= new ArrayList<Carrera>();
	
	public Carrera crearCarrera(String NombreDeCarrera) {
		
		Carrera carrera=new Carrera(NombreDeCarrera);
		Carreras.add(carrera);
		
		return carrera;
	}
	

	
     
   
	public void agregarMateria(List<Materia> materia, Carrera carrera) {
		// Recorremos la lista de materias que queremos agregar
        for (Materia m : materia) {
        	carrera.agregarMateriasAUnaCarrera(m);
            /*
              this.materias.add(m);
              me parece que este metodo no va aca. este controlador no necesita una lista de materias
             */
	}
	}
    public Boolean validarCargaHorariaMax( Carrera carrera) {
        // TODO implement here
        return false;
    }

}