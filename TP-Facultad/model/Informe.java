package model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import model.Curso;
import model.Docente;

public class Informe {

    private List<Curso> cursos;
    private int idInforme;
    private String tipoInforme;
    private int idDocente;

    public Informe(int idDocente, List<Curso> cursos, int IdInforme){
        this.idDocente = idDocente;
        this.cursos = cursos;
        this.idInforme = IdInforme;
    }


    public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
    
	public List<Curso> getCursos() {
		return cursos;
	}

    public void setIdInforme() {
        this.idInforme = idInforme;
    }

    public int getIdInforme(){
        return idInforme;
    } 

    public void setTipoInforme() {
        this.tipoInforme = tipoInforme;
    }

    public String getTipoInforme(){
        return tipoInforme;
    } 
   
    public String toString(){
    	
        StringBuilder sb = new StringBuilder();
        sb.append("Informe(docente)").append(idDocente).append(" , listaCursos");
        for (Curso a : cursos) {
            sb.append(a).append("/n");
            System.out.println();
        }
        sb.append('}');
        return sb.toString();
        
    	
    	
    }


	public int getIdDocente() {
		return idDocente;
	}


	public void setDocente(int idDocente) {
		this.idDocente= idDocente;
	}


	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}   

 
    



    
}
