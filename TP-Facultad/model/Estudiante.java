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
     
    private List<Materia> materiasActuales=new ArrayList<Materia>();
    private List<Materia> materiasAprobadas=new ArrayList<Materia>();

	public Estudiante(String nombre, String apellido, int idEstudiante, Boolean estadoEstudiante, Carrera carrera) {
		/*super(); */
		this.nombre = nombre;
		this.apellido = apellido;
		this.idEstudiante = idEstudiante;
		this.estadoEstudiante = estadoEstudiante;
		this.carrera = carrera;
		
		System.out.println("se creo el estudiante: " + nombre + " " + apellido + ", id = " + idEstudiante +  ", estudia la carrera "+ carrera.getNombreDeCarrera());;
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
	    
	/*
    public boolean ValidarCorrelactividad(Carrera carrera,  Materia materia) {
    	 Materia materiaCorrelativa = carrera.Correlatividad(materia);
        return false;
    }
*/
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", idEstudiante=" + idEstudiante
				+ ", estadoEstudiante=" + estadoEstudiante + ", carrera=" + carrera + "]";
	}

	public List<Materia> getMateriasActuales() {
		return materiasActuales;
	}
	
	public List<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}
	
	public void setMateriasActuales(List<Materia> materiasActuales) {
		this.materiasActuales = materiasActuales;
	}
    
    
	public boolean yaAproboLaMateria (Materia materia) {
		if (materia==null)
			return true;
		
		if (materiasAprobadas.contains(materia) ) {
			return true;
		}
			else 		{
				return false;
			}
	}
	
    public void agregarMateriaAprobadaALista (Materia materia) {
    	/* tambien la saca de la lista de cursando actualmente  */
    	
    	materiasActuales.remove(materia);
    	materiasAprobadas.add(materia);
    	
    }

}