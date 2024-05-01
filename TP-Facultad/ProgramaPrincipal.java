import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		
		Carrera carrera1 = new Carrera("Ingenieria en Sistemas");
		Carrera carrera2 = new Carrera("Derecho");
		Carrera carrera3 = new Carrera("Ingenieria Quimica");
		
		ControladorCarrera controladorCarrera = new ControladorCarrera();
		
		List<Materia> materias = new ArrayList<>();
		
	    materias.add(new Materia(3400,"Analisis Matematico", true));
	    
	    materias.add(new Materia(3500,"Programacion", false));
		
	    controladorCarrera.agregarMateria(materias);
		
		Estudiante estudiante1 = new Estudiante("Maria", "Luzzi", 1234, true, carrera1);
		Estudiante estudiante2 = new Estudiante("Agustina", "Cafiero", 2234, true, carrera2);
		Estudiante estudiante3 = new Estudiante("Yancamil", "Gomez Lopez", 7654, true, carrera3);
		Estudiante estudiante4 = new Estudiante("Jose", "Sparks", 9987, true, carrera1);
	
		
		estudiante1.setCarrera(carrera1);
		estudiante2.setCarrera(carrera2);
		estudiante3.setCarrera(carrera3);
		estudiante4.setCarrera(carrera1);
		
		Docente docente1 = new Docente ("Esteban", "Lamonte", 35);
		Docente docente2 = new Docente ("Carmen", "Lopez", 22);
		
		// TODO Auto-generated method stub

	}

}
