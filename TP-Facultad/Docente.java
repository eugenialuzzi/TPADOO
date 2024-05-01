
import java.util.*;

/**
 * 
 */
public class Docente {

    /**
     * Default constructor
     */
    public Docente() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private int idDocente;

    private Curso curso;


    

    public Docente(String nombre, String apellido, int idDocente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.idDocente = idDocente;
	}
	
	public Curso getCurso() {
	        return curso;
	    }

	public void setCarrera(Curso curso) {
	        this.curso = curso;
	    }
	

	@Override
	public String toString() {
		return "Docente [nombre=" + nombre + ", apellido=" + apellido + ", idDocente=" + idDocente
				+ ", cursosAsignados=" + /*listadoCursos +*/ "]";
	}

}