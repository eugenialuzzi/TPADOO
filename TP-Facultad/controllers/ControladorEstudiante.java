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

    public void altaEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public List<Estudiante> getListaEstudiantes(){
        return this.estudiantes;
    }

	
    private static ControladorEstudiante instancia;

    public static ControladorEstudiante getInstancia() {
        if (instancia==null) {
            instancia = new ControladorEstudiante();
        }
        return  instancia;
    }

	int contador=1;
    public Estudiante crearEtudiante(String nombre, String apellido, boolean regular, Carrera carrera) {
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

}