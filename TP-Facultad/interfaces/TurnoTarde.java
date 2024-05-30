package interfaces;

import java.time.LocalTime;

public class TurnoTarde implements TurnoInterface{

	@Override
	public String queTurnoEs() {
		return "Turno Tarde";
	}

	@Override
	public LocalTime horaInicio() {
		return LocalTime.of(14,00,00);
	}
	@Override
	public LocalTime horaFin(){
		return LocalTime.of(18, 00,00);
	}
}
