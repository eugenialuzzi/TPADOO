import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Carrera carrera = new Carrera("Ingenieria en Sistemas");
		
		ControladorCarrera controladorCarrera = new ControladorCarrera();
		
		List<Materia> materias = new ArrayList<>();
		
	    materias.add(new Materia(3400,"Analisis Matematico", true));
	    
	    materias.add(new Materia(3500,"Programacion", false));
		
	    controladorCarrera.agregarMateria(materias);
		
		Estudiante estudiante1 = new Estudiante("Maria", "Luzzi", 1234, true, carrera);
	
		
		estudiante1.setCarrera(carrera);
		
		// TODO Auto-generated method stub

	}

}
