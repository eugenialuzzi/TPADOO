package model;

import java.time.LocalTime;
import java.util.List;

import controllers.ControladorDocente;
import model.Curso;
import model.Docente;
import model.Informe;


public class FactoryInforme{

	
public void exportar(Informe informe){
    
    System.out.println("Se exportó el informe: " + informe.getIdInforme() + " correctamente" );

}

public Informe crearInforme(int intDocente, List<Curso> cursos, int idInforme){
        
        return new Informe(intDocente, cursos, idInforme);
    
    }

ControladorDocente controladorDocente = ControladorDocente.getInstance();

public void mostrarInformeResumido(Informe informe) {
	System.out.println("segun el informe "+informe.getIdInforme());
	
	///controladorDocente.buscarDocentePorSuId(informe.getIdDocente()).getApellido();
	System.out.println(" el docente "+controladorDocente.buscarDocentePorSuId(informe.getIdDocente()).getApellido()+" tiene ");
	
	for (Curso cursoActual: informe.getCursos()) {
		System.out.println(cursoActual.getIdCurso() +"     "+ cursoActual.getTurno());
	}
	
	
}


    




}