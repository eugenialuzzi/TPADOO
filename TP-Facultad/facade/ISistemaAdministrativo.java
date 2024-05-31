package facade;
import model.Curso;
import model.Docente;
import model.Estudiante;
import model.Materia;
import model.DiaSemana;
import interfaces.TurnoInterface;

import java.util.List;

public interface ISistemaAdministrativo {

	boolean inscribir(Estudiante estudiante, Materia materia, Curso curso);

	void calcularMonto(Estudiante estudiante);

	void mostrarCursosDisponibles(Materia materia);

	Docente crearDocente(String nombre, String apellido);

	void agregarCursoADocente(List<Curso> cursos, Docente docente);

	void compararPreferenciasDocentes(Docente docente, Curso curso);

	void crearCursoPotencial(int idDocente, DiaSemana diaSemana, TurnoInterface turno, int horasAsignadas);

	List<Curso> cursosAsignados(int idDocente);

	List<String> cronogramaSemanal(int idDocente);

	Docente buscarDocentePorSuId(int idDocente);

	int horasTrabajadasDocente(int idDocente);
}


