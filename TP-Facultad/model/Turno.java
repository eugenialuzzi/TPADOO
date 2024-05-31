package model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import interfaces.TurnoInterface;

public class Turno {

    private String nombre;
    private TurnoInterface turnoStrategy;

    public Turno(String nombre, TurnoInterface turnoStrategy) {
        this.nombre = nombre;
        this.turnoStrategy = turnoStrategy;
        this.turnoStrategy.horaInicio();
        this.turnoStrategy.horaFin();
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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