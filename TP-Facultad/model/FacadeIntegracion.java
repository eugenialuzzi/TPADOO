package model;

import controllers.ControladoInscripcion;
import controllers.ControladorDocente;
import model.Curso;
import model.Estudiante;
import model.Materia;
import model.Docente;
import model.DiaSemana;
import interfaces.TurnoInterface;

import java.util.List;

import java.util.ArrayList;



import controllers.ControladorEstudiante;

public class FacadeIntegracion {
	
	/*
	ControladorDocente controladorDocente = ControladorDocente.getInstance();
	ControladorEstudiante controladorEstudiante =ControladorEstudiante.getInstance();  
	
	public  Docente crearDocente(String nombre, String apellido) {
		Docente docente=controladorDocente.crearDocente(nombre, apellido);
		
		return docente;
	}
	
	public void agregarCursosADocente(List<Curso> cursos, Docente docente) {
		controladorDocente.agregarCursoADocente(cursos, docente);
	}
	
	public void agregar1CursoADocente(Curso curso, Docente docente) {
		List<Curso> lista=new ArrayList<Curso>();
		lista.add(curso);
		agregarCursosADocente(lista, docente);
	}
	
	*/
	


	

	public class UniversityFacade {

	    private ControladoInscripcion inscripcionController;
	    private ControladorDocente docenteController;

	    public UniversityFacade() {
	        inscripcionController = ControladoInscripcion.getInstance();
	        docenteController = ControladorDocente.getInstance();
	    }

	    // Métodos para el módulo de inscripción
	    public boolean inscribirEstudiante(Estudiante estudiante, Materia materia, Curso curso) {
	        return inscripcionController.inscribir(estudiante, materia, curso) != null;
	    }

	    public void calcularMonto(Estudiante estudiante) {
	        inscripcionController.calcularMonto(estudiante);
	    }

	    public void mostrarCursosDisponibles(Materia materia) {
	        inscripcionController.mostrarCursosDisponibles(materia);
	    }

	    // Métodos para el módulo de administración docente
	    public Docente crearDocente(String nombre, String apellido) {
	        return docenteController.crearDocente(nombre, apellido);
	    }

	    public void agregarCursoADocente(List<Curso> cursos, Docente docente) {
	        docenteController.agregarCursoADocente(cursos, docente);
	    }

	    public void compararPreferenciasDocentes(Docente docente, Curso curso) {
	        docenteController.compararPreferenciasDocentes(docente, curso);
	    }

	    public void crearCursoPotencial(int idDocente, DiaSemana diaSemana, TurnoInterface turno, int horasAsignadas) {
	        docenteController.crearCursoPotencial(idDocente, diaSemana, turno, horasAsignadas);
	    }

	    public List<Curso> cursosAsignados(int idDocente) {
	        return docenteController.cursosAsignados(idDocente);
	    }

	    public List<String> cronogramaSemanal(int idDocente) {
	        return docenteController.cronogramaSemanal(idDocente);
	    }

	    public Docente buscarDocentePorSuId(int idDocente) {
	        return docenteController.buscarDocentePorSuId(idDocente);
	    }

	    public int horasTrabajadasDocente(int idDocente) {
	        return docenteController.horasTrabajadasDocente(idDocente);
	    }
	
	 }
}

/*

	=================================================MAIN===========================================

	public class SistemaAdministrativo {

	    public static void main(String[] args) {
	        UniversityFacade facade = new UniversityFacade();

	        // Crear un nuevo docente
	        Docente docente = facade.crearDocente("Juan", "Pérez");

	        // Crear un curso potencial para el docente
	        facade.crearCursoPotencial(docente.getIdDocente(), DiaSemana.LUNES, new Turno("Mañana"), 3);

	        // Mostrar cronograma semanal del docente
	        List<String> cronograma = facade.cronogramaSemanal(docente.getIdDocente());
	        cronograma.forEach(System.out::println);

	        // Inscribir un estudiante en un curso
	        Estudiante estudiante = new Estudiante("Ana", "González", 1);
	        Materia materia = new Materia("Matemáticas", 101);
	        Curso curso = new Curso(1, DiaSemana.LUNES, null, 30, null, null);

	        boolean inscripcionExitosa = facade.inscribirEstudiante(estudiante, materia, curso);
	        System.out.println("Inscripción exitosa: " + inscripcionExitosa);

	        // Calcular el monto que debe pagar el estudiante
	        facade.calcularMonto(estudiante);
	    }
	}

	
	*/

