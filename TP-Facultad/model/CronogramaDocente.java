package model;

import java.util.ArrayList;
import java.util.List;

import controllers.ControladorDocente;


public class CronogramaDocente {

private Docente docente = new Docente();
private List<Docente> docentes= new ArrayList<Docente>();

private List<Curso> cursos= new ArrayList<Curso>();

public void setDocente(Docente docente){
    this.docente = docente;
}

public void setCursos(Docente docente){
    cursos = docente.getCursos();
}


public List<String> crearCronogramaSemanal(int idDocente) {
    List<String> cronogramaSemanal = new ArrayList<String>();
    Docente docente = new Docente();
    ControladorDocente controladorDocente = ControladorDocente.getInstance();
    docente = controladorDocente.buscarDocentePorSuId(idDocente);
    
            for (Curso curso : docente.getCursos()) {
                if (curso.getDiaSemana() != null) {
                    String cursoInfo = curso.getDiaSemana() + " - " +curso.getIdCurso()+ " "+curso.getTurno().horaInicio()+" a "+curso.getTurno().horaFin();
                    
                    cronogramaSemanal.add(cursoInfo);
                }
            }
    return cronogramaSemanal;
}

public void imprimirCronogramaDocente(List<String> cronogramaSemanal){
    System.out.println("El cronograma del docente es: ");
    for(String dia:cronogramaSemanal){
        System.out.println(dia);
    }
}
    
}
