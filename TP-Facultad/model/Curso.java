	package model;

import java.util.*;
import java.time.LocalTime;
import interfaces.TurnoInterface;


public class Curso{

    private int idCurso;
    private LocalTime horario;
    private Aula aula;
    private DiaSemana diaSemana;
    private List<Materia> materias;
    private Materia materia;
    private TurnoInterface turno;
    
    
    
    
    private int lugaresDisponibles;
    private int cantidadDeInscriptos;

    
    
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public Curso(int idCurso, DiaSemana diaSemana, LocalTime horario, Aula aula, TurnoInterface turno) {
		super();
		this.idCurso = idCurso;
		
		this.horario = horario;
		this.aula = aula;
		this.diaSemana = diaSemana;
		this.materias = new ArrayList<>();
		this.turno=turno;
	}
	/*TEST HORARIO EUGE*/
	public Curso(int idCurso, DiaSemana diaSemana, Aula aula, TurnoInterface turno) {
		super();
		this.idCurso = idCurso;
		this.aula = aula;
		this.diaSemana = diaSemana;
		this.materias = new ArrayList<>();
		this.turno=turno;
		this.turno.horaInicio();
        this.turno.horaFin();
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
	 
	
	public TurnoInterface getTurno() {
	        return turno;
	    }

	public void setTurno(TurnoInterface turno) {
	        this.turno = turno;
	    }
	
	
	
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}

	public List<Materia> getMaterias() {
        return materias;
    }

	public void setMateria(Materia materia){
		this.materia = materia;
	}

	public Materia getMateria(){
		return materia;
	}
	
	public void agregarMateriaACurso(Materia materia){
    	materias.add(materia);
    	System.out.println("se agrego la materia " + materia.getNombreMateria() + " al curso ID: " + idCurso + ". aula numero: " + aula.getNumeroAula() +", en el horario de : " + turno.horaInicio()+" a " +turno.horaFin());
    }
	
	public boolean validarMaxInscriptos(){
		if(lugaresDisponibles == 0){
			return false;
		} else{
			return true;
		}
	}

	public Boolean tieneVacante(Curso curso) {
	/*int capacidadAula=curso.getAula().getCapacidadMax();
	int   */
		if (curso.getlugaresDisponibles()-1>=0) {
		return true;
		}
		else {
			System.out.println("el curso " + curso.getIdCurso() + " ya esta lleno, no es posible la inscripcion" ) ;
			return false; 
		}
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", horario=" + horario + ", aula=" + aula + ", diaSemana=" + diaSemana
				+ ", materias=" + materias + ", turno=" + turno + ", materia=" + materia + ", lugaresDisponibles="
				+ lugaresDisponibles + ", cantidadDeInscriptos=" + cantidadDeInscriptos + "]";
	}  
 

}