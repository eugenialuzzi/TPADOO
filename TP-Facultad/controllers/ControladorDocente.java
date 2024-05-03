package controllers;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import interfaces.IExportarArchivo;
import model.Carrera;
import model.Curso;
import model.Estudiante;
import model.Materia;
import model.Docente;

/**
 * 
 */
public class ControladorDocente implements IExportarArchivo {

	private List<Docente> docentes= new ArrayList<Docente>();
	int contador=1;
	private List<Curso> cursos= new ArrayList<Curso>();
	
	
	public ControladorDocente() {
    }
	
    public Docente crearDocente(String nombre, String apellido) {
    	Docente docente= new Docente(nombre, apellido, contador);
    	docentes.add(docente);
    	contador++;
    	return docente;
    }
    
    public void agregarCursoADocente(List<Curso> cursos, Docente docente) {
    	for (Curso c : cursos) {
    		docente.agregaCursoADocente(c);
    	}
        
	}

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