package interfaces;

public class TurnoMañana implements TurnoInterface{

	@Override
	public String queTurnoEs() {
		
		return "Turno Mañana";
	}

	@Override
	public String queFranjaHorariaEs() {

		return "7.45 a 11.45 am";
	}

}
