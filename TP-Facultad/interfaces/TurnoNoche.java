package interfaces;

public class TurnoNoche implements TurnoInterface {

	@Override
	public String queTurnoEs() {
		return "Turno Noche";
	}

	@Override
	public String queFranjaHorariaEs() {
		return "La franja horaria es de 18:45 a : 22:45 pm";
	}

}
