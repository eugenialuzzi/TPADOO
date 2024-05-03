package controllers;

import java.util.*;

import model.Carrera;
import model.Estudiante;
import model.Materia;

/**
 * 
 */
public class ControladorEstudiante {
	
	private List<Estudiante> estudiantes= new ArrayList<Estudiante>();




	int contador=1;
    public Estudiante crearEstudiante(String nombre, String apellido, boolean regular, Carrera carrera) {
    	Estudiante estudiante= new Estudiante(nombre, apellido, contador, regular, carrera);
    	
    	estudiantes.add(estudiante);
    	contador++;
    	return estudiante;
    }
    

    public ControladorEstudiante() {
    }

    /**
     * @param Estudiante estudiante 
     * @return
     */
    public List<Materia> obtenerMateriasAprobadas( Estudiante estudiante) {
        // TODO implement here
        return null;
    }

    public void AgregarMateriaAprobadaALista(Estudiante estudiante, Materia materia) {
    	estudiante.agregarMateriaAprobadaALista(materia);
    	System.out.println("se agrego la materia, "+ materia.getNombreMateria() +"a la lista de aprobadas por el estudiante "+estudiante.getNombre());
    }
    
}