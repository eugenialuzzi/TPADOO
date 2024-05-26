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




    




}