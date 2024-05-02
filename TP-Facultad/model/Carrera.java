package model;

import java.util.*;

public class Carrera {
	
	private String nombreDeCarrera;
    private int cargaHorariaMax;
    private List<Materia> materias;
    
	
    
    
    public Carrera(String nombreDeCarrera) {
        this.nombreDeCarrera = nombreDeCarrera;
        this.cargaHorariaMax = 20;
        this.materias = new ArrayList<>();
    }


	public int getCargaHorariaMax() {
		return cargaHorariaMax;
	}
	

    public List<Materia> getMaterias() {
        return materias;
    }
    
    
    public List<Materia> Correlatividad(Materia materia) {
        // TODO implement here
        return null;
    }

    
}