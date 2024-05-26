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

	
private static ControladorDocente instance;
	
	private ControladorDocente () { 
		
	}
	
	 public static ControladorDocente  getInstance() {

	        if (instance == null) {

	            instance = new ControladorDocente ();

	        }

	        return instance;

	    }
	
	
	private List<Docente> docentes= new ArrayList<Docente>();
	int contador=1;
	private List<Curso> cursos= new ArrayList<Curso>();
	

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
        List<Curso> cursosAsignados = new ArrayList<>();
        for (Docente docente : docentes) {
            if (docente.getIdDocente() == idDocente) {
                cursosAsignados = docente.getCursos();
                break;
            }
        }
        return cursosAsignados;
    }
    
    
    public List<String> cronogramaSemanal(int idDocente) {
        List<String> cronogramaSemanal = new ArrayList<>();
        for (Docente docente : docentes) {
            if (docente.getIdDocente() == idDocente) {
                for (Curso curso : docente.getCursos()) {
                    if (curso.getDiaSemana() != null) {
                        String cursoInfo = curso.getDiaSemana() + " - " +curso.getIdCurso()+ " - " + curso.getHorario();
                        cronogramaSemanal.add(cursoInfo);
                    }
                }
                break; 
            }
        }
        return cronogramaSemanal;
    }
   

	@Override
	public void exportar(List<Curso> cursos) {
		// TODO Auto-generated method stub
		
	}

	public Docente buscarDocentePorSuId(int idDocente) {
		
		for(Docente docente:docentes) {
			int idActual=docente.getIdDocente();
			if (idActual==idDocente) {
				return docente;
			}else {
				continue;
				
			}	
		}
		System.out.println("no se encontro un docente con esa id");
		return null;
	}
}