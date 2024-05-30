package model;

import interfaces.ILiquidacion;

public class RecursosHumanos implements ILiquidacion {

	@Override
	public int horasLiquidadas(Docente docente) {
		
		return docente.calcularHorasAsignadas();
	}

}
