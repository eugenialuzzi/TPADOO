package model;

import java.util.*;

public class Carrera {
	
	private String nombreDeCarrera;
    private int cargaHorariaMax;
    private List<Materia> materias;
    
	
    
    
    public String getNombreDeCarrera() {
		return nombreDeCarrera;
	}

	public void setNombreDeCarrera(String nombreDeCarrera) {
		this.nombreDeCarrera = nombreDeCarrera;
	}

	public void setCargaHorariaMax(int cargaHorariaMax) {
		this.cargaHorariaMax = cargaHorariaMax;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public Carrera(String nombreDeCarrera) {
        this.nombreDeCarrera = nombreDeCarrera;
        this.cargaHorariaMax = 20;
        this.materias = new ArrayList<>();
    }

    public void agregarMateriasAUnaCarrera(Materia materia){
    	materias.add(materia);
    	System.out.println("se agrego la materia " + materia.getNombreMateria() + " a la carrera: " + nombreDeCarrera);
    }
    
    public void quitarMateriaDeUnaCarrera(Materia materia) {
    	materias.remove(materia);
    	System.out.println("se quito la materia" + materia.getNombreMateria() + " a la carrera: " + nombreDeCarrera);
    }
    
    
	public int getCargaHorariaMax() {
		return cargaHorariaMax;
	}
	

    public List<Materia> getMaterias() {
        return materias;
    }
    
    
    public Materia Correlatividad(Materia materia) {
        // TODO implement here
        return materia.getMateriaCorrelativaAnterior();
    }

    
}