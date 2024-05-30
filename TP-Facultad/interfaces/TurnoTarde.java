package interfaces;

public class TurnoTarde implements TurnoInterface{

	@Override
	public String queTurnoEs() {
		return "Turno Tarde";
	}

	@Override
	public String queFranjaHorariaEs() {
		return "13:45 a 18:00 pm";
	}

}
