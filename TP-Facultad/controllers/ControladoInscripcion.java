package controllers;

import java.time.Clock;
import java.time.LocalDate;
import java.util.*;

import model.Carrera;
import model.Curso;
import model.Estudiante;
import model.Materia;

/**
 * 
 */
public class ControladoInscripcion {
	
	private Clock reloj; 
	ControladorCurso controladorCurso=new  ControladorCurso();
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
    	
    	return controladorCurso.tieneVacante(curso);
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
    	LocalDate fechaLimite = null;
        if (fechaLimite.isBefore(LocalDate.now(reloj))) {
        	return true;
        }
    	
    	
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
    	Carrera laCarrera=estudiante.getCarrera();
    	Materia correlativa=laCarrera.Correlatividad(materia);
        if (estudiante.yaAproboLaMateria(correlativa)) {
        	return true;
        }
        else {
        	return false;
        }
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
    private boolean chequearCargaHoraria(Estudiante estudiante, Materia materia) {
        Carrera carrera=estudiante.getCarrera();
    	int cargaHorariamaxima=carrera.getCargaHorariaMax();
    	int cargaHorariaActual=estudiante.getCargaHorariaActual(); 
    	int cargaHorariaMateriaNueva=materia.getCargaHorariaMat();
    	if((cargaHorariaActual + cargaHorariaMateriaNueva)>cargaHorariamaxima) {
    		System.out.println("se esta excediendo la cantidad de horas maximas de cursada");
    		return false;
    	}
    	else {
    		return true;
    	}
    }

	public Estudiante inscribir(Estudiante estudiante1, Materia materia,Curso curso) {
		boolean bandera =true;
		
		/* hay que hacer lo de la fecha limite */
		
		if (chequearCorrelativas(estudiante1,materia)==false) {
			bandera=false;
		}
		
		if (curso.tieneVacante(curso)==false) {
			bandera=false;
		}
		if (chequearCargaHoraria(estudiante1,materia)==false) {
			bandera=false;
		}
		
		//Carrera carrera=estudiante1.getCarrera();
		
		//Materia correlativaAnterior=mat2.getMateriaCorrelativaAnterior();
		//if(correlativaAnterior!=null) {
			//List<Materia> materiasAprobadas=estudiante1.getMateriasAprobadas();
			/*Verificar si el estudiante tiene cursada la correlativa necesaria*/
	        //if (materiasAprobadas.contains(correlativaAnterior)) {
	          //  System.out.println("El alumno " +estudiante1.getNombre()+ " se puede anotar a la materia "+ mat2.getNombreMateria());
	            /*esto hay que cambiarlo no lo puedo anotar a una materia sino a un curso especifico */
	            //estudiante1.getMateriasActuales().add(mat2);
	        //} else {
	          //  System.out.println("El alumno NO se puede anotar a la materia "+ mat2.getNombreMateria()+", le faltan correlativas");
	        //}
		//}else {
			//System.out.println("esta materia " +  mat2.getNombreMateria() +" no tiene correlativas anteriores");
			/*aca lo tendria que anotar */
			/* esto hay que sacarlo no lo puedo anotar a una materia sino a un curso especifico  */
			//estudiante1.getMateriasActuales().add(mat2);
		//}
		
		return estudiante1;
		
	}
	private boolean chequearCorrelativas(Estudiante estudiante1, Materia mat2) {
		
		Materia correlativaAnterior=mat2.getMateriaCorrelativaAnterior();
		if(correlativaAnterior!=null) {
			List<Materia> materiasAprobadas=estudiante1.getMateriasAprobadas();
			// Verificar si el estudiante tiene cursada la correlativa necesaria
	        if (materiasAprobadas.contains(correlativaAnterior)) {
	            System.out.println("El alumno " +estudiante1.getNombre()+ 
	            		" se puede anotar a la materia "+ mat2.getNombreMateria());
	            return true;
	        } else {
	            System.out.println("El alumno NO se puede anotar a la materia "
	            		+ mat2.getNombreMateria()+", le faltan correlativas");
	            return false;
	        }
		}else {
			System.out.println("esta materia " +  mat2.getNombreMateria() +
					" no tiene correlativas anteriores");
			return true;
			
		}
		
	}

}