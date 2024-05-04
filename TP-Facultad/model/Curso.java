package model;

import java.util.*;
import java.time.LocalTime;

public class Curso {

    private int idCurso;
    private LocalTime horario;
    private Aula aula;
    private List<Materia> materias;
    private int lugaresDisponibles;
    private int cantidadDeInscriptos;
    
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public Curso(int idCurso, LocalTime horario, Aula aula) {
		super();
		this.idCurso = idCurso;
		this.horario = horario;
		this.aula = aula;
		this.materias = new ArrayList<>();
	}


	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
    
	
	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public int getlugaresDisponibles() {
		lugaresDisponibles=(aula.getCapacidadMax()-cantidadDeInscriptos);
		
		//System.out.println("capacidad aula dentro de la clase curso es: "+aula.getCapacidadMax() + "y la cantidad de inscriptos es : "+cantidadDeInscriptos);
		
		return lugaresDisponibles;
	}
	
	public void setlugaresDisponibles(int numerolugaresDisponibles) {
		lugaresDisponibles=numerolugaresDisponibles;
		
	}
	
	public int getcantidadDeInscriptos() {
		
		return cantidadDeInscriptos;
	}
	
	public void setcantidadDeInscriptos(int numeroDeInscriptos) {
		cantidadDeInscriptos=numeroDeInscriptos;
		
	}
 
	
	public List<Materia> getMaterias() {
        return materias;
    }
	
	public void agregarMateriaACurso(Materia materia){
    	materias.add(materia);
    	System.out.println("se agrego la materia " + materia.getNombreMateria() + " al curso ID: " + idCurso + ". aula numero: " + aula.getNumeroAula() +", en el horario: " + horario);
    }
	
	

	public Boolean tieneVacante(Curso curso) {
	/*int capacidadAula=curso.getAula().getCapacidadMax();
	int   */
		if (curso.getlugaresDisponibles()-1>=0) {
		return true;
		}
		else {
			System.out.println("el curso " + curso.getIdCurso() + " ya esta lleno, no es posible la incripcion" ) ;
			return false; 
		}
	}  

}