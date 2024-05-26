package model;

import java.util.List;

public class Excel extends Informe{

    private List<Curso> cursos;
    private int idInforme;
    private String tipoInforme;
    private int idDocente;
    

    public Excel(int idDocente, List<Curso> cursos, int IdInforme) {
        super(idDocente, cursos, IdInforme);
        //TODO Auto-generated constructor stub
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
        this.tipoInforme = "EXCEL";
    }

    public String getTipoInforme(){
        return tipoInforme;
    } 

}
