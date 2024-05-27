package controllers;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

import model.Carrera;
import model.Curso;
import model.Estudiante;
import model.Materia;

/**
 * 
 */
public class ControladoInscripcion {
	
	
private static ControladoInscripcion instance;
	
	private ControladoInscripcion() { 
		
	}
	
	 public static ControladoInscripcion getInstance() {

	        if (instance == null) {

	            instance = new ControladoInscripcion();

	        }

	        return instance;

	    }
	
	private Clock relojFijo = Clock.fixed(Instant.parse("2025-04-29T10:15:30.00Z"),ZoneId.of("Asia/Calcutta"));

	ControladorCurso controladorCurso = ControladorCurso.getInstance();
  
  
    public Boolean tieneVacante(Curso curso) {
    	
    	return controladorCurso.tieneVacante(curso);
    }

    public void mostrarCursosDisponibles( Materia materia) {
    	materia.getCursosDisponibles();
       
    }

    private boolean validarFechaLimite(Estudiante estudiante) {
    	
    	Carrera carrera=estudiante.getCarrera();
    	LocalDate fechaLimite = carrera.getFacultad().getfechaLimite();
    	
        if (fechaLimite.isAfter(LocalDate.now(relojFijo))) {
        	return true;
        }  	
        else {
        	System.out.println("la fecha limite de las inscripciones ya ha pasado");
        	
        	return false;
        }
    }


    public Integer validarCantCursosInscriptos( Estudiante estudiante) {
        
        return null;
    }

    public Boolean validarCorrelativas( Estudiante estudiante,  Materia materia) {
    	Carrera laCarrera=estudiante.getCarrera();
    	Materia correlativa=laCarrera.Correlatividad(materia);
        if (estudiante.yaAproboLaMateria(correlativa)) {
        	return true;
        }
        else {
        	return false;
        }
    }

	ControladorPago controladorPago = new ControladorPago();

    public void calcularMonto(Estudiante estudiante) {
		Double precio = 0.0;
		List<Materia> materias = new ArrayList<Materia>();
		materias = estudiante.getMateriasActuales();
		for(Materia materia:materias){
			if(materias.size() == 0){
				break;
			}
			precio = precio + materia.getCosto();
		}
		System.out.println("El total que deberá abonar alumno será de: " + precio);
		controladorPago.pagar(precio);


    }

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
		
		if (validarFechaLimite(estudiante1)==false ) {
			bandera=false;
		}
		
		if (chequearCorrelativas(estudiante1,materia)==false) {
			bandera=false;
		}
		
		if (curso.tieneVacante(curso)==false) {
			bandera=false;
		}
		if (chequearCargaHoraria(estudiante1,materia)==false) {
			bandera=false;
		}
		
		if (bandera==true) {
			
			int numeroActual=curso.getcantidadDeInscriptos();
			curso.setcantidadDeInscriptos(numeroActual+1);
			System.out.println("se inscribio al alumno "+estudiante1.getApellido()+" "+estudiante1.getNombre()+" a la materia "+materia.getNombreMateria()+" en el curso "+curso.getIdCurso());
			
			estudiante1.agregarMateriaQueEstaCursando(materia);
		}
		 /* falta la parte del cobro hay que sumarle esa materia nueva al costo del alumno */
		
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