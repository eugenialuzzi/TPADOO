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
    public Boolean tieneVacante(Estudiante estudiante) {
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
        return false;
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

}