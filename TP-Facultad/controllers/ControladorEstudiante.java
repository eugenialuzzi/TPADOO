package controllers;

import java.util.*;

import model.Estudiante;
import model.Materia;

/**
 * 
 */
public class ControladorEstudiante {
    private static ControladorEstudiante instancia;

    public static ControladorEstudiante getInstancia() {
        if (instancia==null) {
            instancia = new ControladorEstudiante();
        }
        return  instancia;
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