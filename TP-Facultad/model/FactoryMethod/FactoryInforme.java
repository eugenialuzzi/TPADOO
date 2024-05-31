package model.FactoryMethod;

import java.time.LocalTime;
import java.util.List;

import controllers.ControladorDocente;
import interfaces.TurnoInterface;
import model.Curso;
import model.Docente;
import model.Informe;


public class FactoryInforme{

	
public void exportar(Informe informe){
    
    System.out.println("Se exportó el informe: " + informe.getIdInforme() + " correctamente" );

}

public Informe crearInforme(int idDocente, List<Curso> cursos, int idInforme){
        
        return new Informe(idDocente, cursos, idInforme);
    
    }

ControladorDocente controladorDocente = ControladorDocente.getInstance();

public void mostrarInformeResumido(Informe informe) {
	System.out.println("segun el informe "+informe.getIdInforme());
	
	
	System.out.println(" el docente "+controladorDocente.buscarDocentePorSuId(informe.getIdDocente()).getApellido()+" tiene ");
	
	for (Curso cursoActual: informe.getCursos()) {
		TurnoInterface turno = cursoActual.getTurno();
        System.out.println(cursoActual.getIdCurso() + " " + turno.queTurnoEs() + " " );
	}
	
	
}


    




}