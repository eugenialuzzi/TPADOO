package interfaces;

import java.util.*;

import model.Curso;

/**
 * 
 */
public interface IExportarArchivo {

    /**
     * @param list<Curso>
     */ 
    public void exportar( List <Curso> cursos);

}