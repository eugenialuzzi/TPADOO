package controllers;

import java.util.*;

import interfaces.IExportarArchivo;
import model.Curso;

/**
 * 
 */
public class ControladorDocente implements IExportarArchivo {

    /**
     * Default constructor
     */
    public ControladorDocente() {
    }

    /**
     * @param idDocente 
     * @return
     */
    public List<Curso> cursosAsignados(int idDocente) {
        // TODO implement here
        return null;
    }

    /**
     * @param idDocente 
     * @return
     */
    public List<Curso> cronogramaSemanal(int idDocente) {
        // TODO implement here
        return null;
    }

    /**
     * @param list<Curso>
     */
    
   

	@Override
	public void exportar(List<Curso> cursos) {
		// TODO Auto-generated method stub
		
	}

}