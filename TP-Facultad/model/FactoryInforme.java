package model;

import java.time.LocalTime;
import java.util.List;

import model.Curso;
import model.Docente;
import model.Informe;


public class FactoryInforme{


public void exportar(Informe informe){
    
    System.out.println("Se exportó el informe: " + informe.getIdInforme() + " correctamente" );

}

public Informe crearInforme(Docente docente, List<Curso> cursos, int idInforme){
        
        return new Informe(docente, cursos, idInforme);
    
    }

public void mostrarInformeResumido(Informe informe) {
	System.out.println("segun el informe "+informe.getIdInforme());
	
	System.out.println(" el docente "+informe.getDocente().getApellido()+" tiene ");
	
	for (Curso cursoActual: informe.getCursos()) {
		System.out.println(cursoActual.getIdCurso() +"     "+ cursoActual.getTurno());
	}
	
	
}


    




}