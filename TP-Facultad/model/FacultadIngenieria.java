package model;

import java.time.LocalDate;
import java.util.List;

public class FacultadIngenieria extends Facultad{

    private String nombre;
	
	private LocalDate fechaLimite=LocalDate.parse("2030-11-08");

    private List<Carrera> carreras;

    public void setfechaLimite(String fecha) {
		fechaLimite=LocalDate.parse(fecha);
	}
	
	public LocalDate getfechaLimite() {
		
		return fechaLimite;
	}
	
	public String getNombreDeFacultad() {
		return nombre;
	}

	public void setNombreDeFacultad(String nombreDeFacultad) {
		this.nombre = nombreDeFacultad;
	}
    
}
