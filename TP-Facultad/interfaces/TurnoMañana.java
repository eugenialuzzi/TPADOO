package interfaces;

import java.time.LocalTime;

public class TurnoMañana implements TurnoInterface{

	@Override
	public String queTurnoEs() {
		
		return "Turno Mañana";
	}

	@Override
	public LocalTime horaInicio() {
		return LocalTime.of(07, 45,00);
	}
	@Override
	public LocalTime horaFin(){
		return LocalTime.of(11, 45,00);
	}

}
