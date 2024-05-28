package model;

import interfaces.TurnoInterface;

public class TurnoTarde implements TurnoInterface {

	@Override
	public String queTurnoEs() {
		
		return "es turno tarde";
	}

	@Override
	public String queFranjaHorariaEs() {
		
		return "es de 14 a 16";
	}
}