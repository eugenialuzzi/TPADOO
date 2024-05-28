package interfaces;

public class TurnoTarde implements TurnoInterface{

	@Override
	public String queTurnoEs() {
		return "Turno Tarde";
	}

	@Override
	public String queFranjaHorariaEs() {
		return "La franja horaria es de 12:45 a 15:15 pm";
	}

}
