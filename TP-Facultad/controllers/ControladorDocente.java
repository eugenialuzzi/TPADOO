package controllers;

import java.util.*;

import interfaces.IExportarArchivo;
import model.Carrera;
import model.Curso;
import model.Estudiante;
import model.Docente;

/**
 * 
 */
public class ControladorDocente implements IExportarArchivo {



	private List<Docente> docentes= new ArrayList<Docente>();

    	int contador=1;
    public Docente crearDocente(String nombre, String apellido) {
    	Docente docente= new Docente(nombre, apellido, contador);
    	
    	docentes.add(docente);
    	contador++;
    	return docente;
    }
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