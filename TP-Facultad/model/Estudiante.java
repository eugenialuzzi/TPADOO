package model;

import java.util.*;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int idEstudiante;
    private Boolean estadoEstudiante;
    private int cargaHorariaActual=0;
    private Carrera carrera;
    private List<Materia> materiasActuales=new ArrayList<Materia>();
    private List<Materia> materiasAprobadas=new ArrayList<Materia>();

	public Estudiante(String nombre, String apellido, int idEstudiante, Boolean estadoEstudiante, Carrera carrera) {
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
    	materiasActuales.remove(materia);
    	materiasAprobadas.add(materia);
    	
    }
    
    public void agregarMateriaQueEstaCursando (Materia materia) {
    	materiasActuales.add(materia);
    	
    }
    
    public void quitarMateriaQueEstaCursando (Materia materia) {
    	materiasActuales.remove(materia);
    }
    
    
    public int getCargaHorariaActual() {
    	int total=0;
    	for (Materia materia:materiasActuales ) {
    		int parcial=materia.getCargaHorariaMat();
    		total=total+parcial;
    	}
    	setCargaHorariaActual(total);
    	return cargaHorariaActual;
    }
    
    public void setCargaHorariaActual(int cargaHoraria) {
    	cargaHorariaActual=cargaHoraria;
    	
    }
    

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", idEstudiante=" + idEstudiante
				+ ", estadoEstudiante=" + estadoEstudiante + ", carrera=" + carrera + "]";
	}

    
    
    
    
    
}