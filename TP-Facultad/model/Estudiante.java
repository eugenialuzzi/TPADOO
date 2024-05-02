package model;

import java.util.*;

/**
 * 
 */
public class Estudiante {
    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private int idEstudiante;

    /**
     * 
     */
    private Boolean estadoEstudiante;

    
    private Carrera carrera;
     
    private Materia materia;


	public Estudiante(String nombre, String apellido, int idEstudiante, Boolean estadoEstudiante, Carrera carrera) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idEstudiante = idEstudiante;
		this.estadoEstudiante = estadoEstudiante;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}
	
	public Carrera getCarrera() {
	        return carrera;
	    }

	public void setCarrera(Carrera carrera) {
	        this.carrera = carrera;
	    }
	
	public int getCargaHorariaMax() {
		return carrera.getCargaHorariaMax();
		
	}
	    
	
    public boolean ValidarCorrelactividad(Carrera carrera,  Materia materia) {
    	 List<Materia> materiasCorrelativas = carrera.Correlatividad(materia);
        return false;
    }

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", idEstudiante=" + idEstudiante
				+ ", estadoEstudiante=" + estadoEstudiante + ", carrera=" + carrera + ", materia=" + materia + "]";
	}
    
    
    
	

}