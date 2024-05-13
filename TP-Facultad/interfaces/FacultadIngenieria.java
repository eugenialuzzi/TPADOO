package interfaces;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class FacultadIngenieria implements IFacultad {

    /**
     * Default constructor
     */
    public FacultadIngenieria() {
    }

    /**
     * 
     */
    private LocalDate fechaLimite=LocalDate.parse("2024-09-01");



	public void setfechaLimite(String fecha) {
		fechaLimite=LocalDate.parse(fecha);
	}
	
	public LocalDate getfechaLimite() {
		
		return fechaLimite;
	}
}
	
	