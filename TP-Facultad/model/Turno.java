package model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Turno {

    private String nombre;
    private LocalTime rangoHorario;
    private List<Curso> cursos;
    private List<Turno> turnos = new ArrayList();

    public Turno(String nombre, LocalTime rangoHorario){
        this.nombre = nombre;
        this.rangoHorario = rangoHorario;
    }

    public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

 

    public void setNombre(){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setrangoHorario(){
        this.rangoHorario = rangoHorario;
    }

    public LocalTime getRangoHorario(){
        return rangoHorario;
    }

    
    
}
