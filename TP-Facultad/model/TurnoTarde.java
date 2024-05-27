package model;

import interfaces.TurnoInterface;

public class TurnoTarde implements TurnoInterface {

	@Override
	public String queTurnoEs() {
		// TODO Auto-generated method stub
		return "es turno tarde";
	}

	@Override
	public String queFranjaHorariaEs() {
		// TODO Auto-generated method stub
		return "es de 14 a 16";
	}
}