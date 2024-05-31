package controllers;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import interfaces.TurnoInterface;
import model.Carrera;
import model.Curso;
import model.DiaSemana;
import model.Estudiante;
import model.Materia;
import model.Turno;
import model.Docente;


public class ControladorDocente {

	
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
    		List <Curso> lista=docente.getCursos();
    		if (lista.contains(c)) {
    			continue;
    		}
    		docente.agregaCursoADocente(c);
    	}
        
	}

    public void compararPreferenciasDocentes(Docente docente, Curso curso) {
    	boolean bandera=false;
    	List<Curso> listaPreferencia=docente.getCursoPreferencial();
    	for(Curso cursoActual:listaPreferencia) {
    		if(curso.getTurno()==cursoActual.getTurno() && curso.getDiaSemana()==cursoActual.getDiaSemana()) {
    			docente.agregaCursoADocente(curso);
    			bandera=true;
    			System.out.println("se le asigno el curso "+curso.getIdCurso()+" al docente "+docente.getApellido());
    			break;
    		}else {
    			continue;
    		}
    	}
    	if (bandera==false) {
    	System.out.println("no hubo coincidencia con los horarios del docente "+docente.getApellido());
    	}
    }
    
		public void crearCursoPotencial(int idDocente, DiaSemana diaSemana, TurnoInterface turno, int horasAsignadas) {
		ControladorCurso controladorCurso = ControladorCurso.getInstance();
		
		Curso curso = controladorCurso.crearCursoPotencial(horasAsignadas, diaSemana, null,turno);
		buscarDocentePorSuId(idDocente).agregarCursoPreferencial(curso);
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
                        String cursoInfo = curso.getDiaSemana() + " - " +curso.getIdCurso()+ " - " +curso.getTurno().horaInicio()+" a "+curso.getTurno().horaFin();
                        cronogramaSemanal.add(cursoInfo);
                    }
                }
                break; 
            }
        }
        return cronogramaSemanal;
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
	
	
	public int horasTrabajadasDocente (int idDocente) {
		
		int horasTrabajadas=buscarDocentePorSuId(idDocente).calcularHorasAsignadas();
		
		return horasTrabajadas;
	}
}