package model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import model.Curso;
import model.Docente;

public class Informe {

    public Informe(){

    }

    private List<Curso> cursos;

    public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
    
	public List<Curso> getCursos() {
		return cursos;
	}


    public void crearInforme(Docente docente, Curso curso){
        String nombre = docente.getNombre();
        LocalTime horario = curso.getHorario();
        Aula aulaAsignada = curso.getAula();
        int cantidadInscriptos = curso.getcantidadDeInscriptos();
        System.out.println("Se creó el informe: " + "Docente asignado: " +  nombre + " Horario asignado: " + horario + " Aula asignada: " + aulaAsignada + " Cantidad de Inscriptos: " + cantidadInscriptos );
    }



    
}
