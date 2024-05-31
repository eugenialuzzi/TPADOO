package facade;

import java.util.List;

import controllers.ControladoInscripcion;
import controllers.ControladorDocente;
import interfaces.TurnoInterface;
import model.Curso;
import model.DiaSemana;
import model.Docente;
import model.Estudiante;
import model.Materia;

public class AdministracionFacade implements ISistemaAdministrativo {
	private ControladoInscripcion inscripcionController;
    private ControladorDocente docenteController;

    public AdministracionFacade() {
        inscripcionController = ControladoInscripcion.getInstance();
        docenteController = ControladorDocente.getInstance();
    }

    @Override
    public boolean inscribir(Estudiante estudiante, Materia materia, Curso curso) {
        return inscripcionController.inscribir(estudiante, materia, curso) != null;
    }

    @Override
    public void calcularMonto(Estudiante estudiante) {
        inscripcionController.calcularMonto(estudiante);
    }

    @Override
    public void mostrarCursosDisponibles(Materia materia) {
        inscripcionController.mostrarCursosDisponibles(materia);
    }

    @Override
    public Docente crearDocente(String nombre, String apellido) {
        return docenteController.crearDocente(nombre, apellido);
    }

    @Override
    public void agregarCursoADocente(List<Curso> cursos, Docente docente) {
        docenteController.agregarCursoADocente(cursos, docente);
    }

    @Override
    public void compararPreferenciasDocentes(Docente docente, Curso curso) {
        docenteController.compararPreferenciasDocentes(docente, curso);
    }

    @Override
    public void crearCursoPotencial(int idDocente, DiaSemana diaSemana, TurnoInterface turno, int horasAsignadas) {
        docenteController.crearCursoPotencial(idDocente, diaSemana, turno, horasAsignadas);
    }

    @Override
    public List<Curso> cursosAsignados(int idDocente) {
        return docenteController.cursosAsignados(idDocente);
    }

    @Override
    public List<String> cronogramaSemanal(int idDocente) {
        return docenteController.cronogramaSemanal(idDocente);
    }

    @Override
    public Docente buscarDocentePorSuId(int idDocente) {
        return docenteController.buscarDocentePorSuId(idDocente);
    }

    @Override
    public int horasTrabajadasDocente(int idDocente) {
        return docenteController.horasTrabajadasDocente(idDocente);
    }

}
