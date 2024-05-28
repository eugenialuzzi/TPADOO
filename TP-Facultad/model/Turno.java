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

    public LocalTime getRangoHorario() {
        return rangoHorario;
    }

    public String queTurnoEs() {
        return turnoStrategy.queTurnoEs();
    }

    public String getQueFranjaHorariaEs() {
        return turnoStrategy.queFranjaHorariaEs();
    }
}