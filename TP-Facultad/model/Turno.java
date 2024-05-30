package model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import interfaces.TurnoInterface;

public class Turno {

    private String nombre;
    private LocalTime rangoHorario;
    private List<Curso> cursos = new ArrayList<>();
    private TurnoInterface turnoStrategy;

    public Turno(String nombre, LocalTime rangoHorario, TurnoInterface turnoStrategy) {
        this.nombre = nombre;
        this.rangoHorario = rangoHorario;
        this.turnoStrategy = turnoStrategy;
    }
	/*TEST HORARIO EUGE*/
    public Turno(String nombre, TurnoInterface turnoStrategy) {
        this.nombre = nombre;
        this.turnoStrategy = turnoStrategy;
        this.turnoStrategy.horaInicio();
        this.turnoStrategy.horaFin();
    }
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRangoHorario(LocalTime rangoHorario) {
        this.rangoHorario = rangoHorario;
    }

    public LocalTime gethoraInicio(){
        return turnoStrategy.horaInicio();
    }
    public void sethoraInicio(LocalTime horaInicio){
        this.turnoStrategy.horaInicio();
    }
    
    public LocalTime gethoraFin(){
        return turnoStrategy.horaFin();
    }
    public void sethoraFin(LocalTime horaFin){
        this.turnoStrategy.horaFin();
    }


    public String queTurnoEs() {
        return turnoStrategy.queTurnoEs();
    }

	public TurnoInterface getTurnoStrategy() {
		return turnoStrategy;
	}

	public void setTurnoStrategy(TurnoInterface turnoStrategy) {
		this.turnoStrategy = turnoStrategy;
	}

  
}