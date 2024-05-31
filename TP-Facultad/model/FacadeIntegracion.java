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



	