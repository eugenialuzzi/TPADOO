package interfaces;

import java.time.LocalTime;

public class TurnoNoche implements TurnoInterface {

	@Override
	public String queTurnoEs() {
		return "Turno Noche";
	}

	@Override
	public LocalTime horaInicio() {
		return LocalTime.of(18,30,00);
	}
	@Override
	public LocalTime horaFin(){
		return LocalTime.of(22, 30,00);
	}

}
