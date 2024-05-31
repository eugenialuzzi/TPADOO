package controllers;

import java.util.*;

import model.Carrera;
import model.Estudiante;
import model.Materia;


public class ControladorCarrera {
	
private static ControladorCarrera instance;
private List<Carrera> Carreras= new ArrayList<Carrera>();


	private ControladorCarrera () { 
		
	}
	
	 public static ControladorCarrera  getInstance() {

	        if (instance == null) {

	            instance = new ControladorCarrera ();

	        }

	        return instance;

	    }
	
	

	
	public Carrera crearCarrera(String NombreDeCarrera) {
		
		Carrera carrera=new Carrera(NombreDeCarrera);
		Carreras.add(carrera);
		
		return carrera;
	}
	

	
     
   
	public void agregarMateria(List<Materia> materia, Carrera carrera) {
        for (Materia m : materia) {
        	carrera.agregarMateriasAUnaCarrera(m);
        }
	}
	
    public Boolean validarCargaHorariaMax( Carrera carrera, Estudiante estudiante) {
       if(estudiante.getCargaHorariaActual()<=carrera.getCargaHorariaMax()) {
    	   return true;
       }
       else
        return false;
    }

}