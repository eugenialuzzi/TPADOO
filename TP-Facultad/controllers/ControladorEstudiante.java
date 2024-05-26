package controllers;

import java.util.*;

import model.Carrera;
import model.Estudiante;
import model.Materia;

public class ControladorEstudiante {
	
private static ControladorEstudiante instance;
	
	private ControladorEstudiante() { 
		
	}
	
	 public static ControladorEstudiante getInstance() {

	        if (instance == null) {

	            instance = new ControladorEstudiante();

	        }

	        return instance;

	    }
	
	
	
	private List<Estudiante> estudiantes= new ArrayList<Estudiante>();

	
    public Estudiante crearEstudiante(String nombre, String apellido, boolean regular, Carrera carrera) {
    	int contador=1;
    	Estudiante estudiante= new Estudiante(nombre, apellido, contador, regular, carrera);
    	
    	estudiantes.add(estudiante);
    	contador++;
    	return estudiante;
    }
    
    public List<Materia> obtenerMateriasAprobadas( Estudiante estudiante) {
        
        return estudiante.getMateriasAprobadas();
    }

    public void AgregarMateriaAprobadaALista(Estudiante estudiante, Materia materia) {
    	estudiante.agregarMateriaAprobadaALista(materia);
    	System.out.println("se agrego la materia, "+ materia.getNombreMateria() +"a la lista de aprobadas por el estudiante "+estudiante.getNombre());
    }
    
    private Estudiante buscarEstudiantePorId(int idEstudianteBuscado) {
    	int id;
    	for (Estudiante estudiante: estudiantes){
    		id=estudiante.getIdEstudiante();
    		if (id==idEstudianteBuscado) {
    			return estudiante;
    		}else {
    			System.out.println("no se encontro un estudiante que corresponda a ese id");		
    		}	
    	}
    	return null;
    	}
}