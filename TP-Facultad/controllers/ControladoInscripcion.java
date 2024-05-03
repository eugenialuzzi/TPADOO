package controllers;

import java.util.*;

import model.Carrera;
import model.Curso;
import model.Estudiante;
import model.Materia;

/**
 * 
 */
public class ControladoInscripcion {

    /**
     * Default constructor
     */
    public ControladoInscripcion() {
    }

    /**
     * @param Estudiante estudiante 
     * @return
     */
    public Boolean tieneVacante(Curso curso) {
        // TODO implement here
        return null;
    }

    /**
     * @param Materia materia 
     * @return
     */
    public List<Curso> mostrarCursosDisponibles( Materia materia) {
        // TODO implement here
        return null;
    }

    /**
     * @param Carrera carrera 
     * @return
     */
    public boolean validarFechaLimite(Carrera carrera) {
        // TODO implement here
        return true;
    }

    /**
     * @param Estudiante estudiante 
     * @return
     */
    public Integer validarCantCursosInscriptos( Estudiante estudiante) {
        // TODO implement here
        return null;
    }

    /**
     * @param Estudiante estudiante 
     * @param Mareria materia 
     * @return
     */
    public Boolean validarCorrelativas( Estudiante estudiante,  Materia materia) {
        // TODO implement here
    	/* hay que armar lo de las correlativodades en la clase materia y en estudiante una lista de las ya cursadas */
        return null;
    }

    /**
     * 
     */
    public void calcularMonto(Map<Materia,Integer> materia) {
        // TODO implement here
    }

    /**
     * @param Estudiante estudiante 
     * @return
     */
    public Integer calcularCargaHoraria(Estudiante estudiante) {
        // TODO implement here
        return null;
    }

	public Estudiante inscribir(Estudiante estudiante1, Materia mat2) {
		
		Carrera carrera=estudiante1.getCarrera();
		
		Materia correlativaAnterior=mat2.getMateriaCorrelativaAnterior();
		if(correlativaAnterior!=null) {
			List<Materia> materiasAprobadas=estudiante1.getMateriasAprobadas();
			// Verificar si el estudiante tiene cursada la correlativa necesaria
	        if (materiasAprobadas.contains(correlativaAnterior)) {
	            System.out.println("El alumno " +estudiante1.getNombre()+ " se puede anotar a la materia "+ mat2.getNombreMateria());
	            estudiante1.getMateriasActuales().add(mat2);
	        } else {
	            System.out.println("El alumno NO se puede anotar a la materia "+ mat2.getNombreMateria()+", le faltan correlativas");
	        }
		}else {
			System.out.println("esta materia " +  mat2.getNombreMateria() +" no tiene correlativas anteriores");
			//aca lo tendria que anotar
			estudiante1.getMateriasActuales().add(mat2);
		}
		return estudiante1;
		
	}

}