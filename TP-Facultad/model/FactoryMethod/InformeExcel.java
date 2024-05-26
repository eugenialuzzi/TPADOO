package model.FactoryMethod;

import model.Informe;

public class InformeExcel extends FactoryInforme {
    
    public void exportar(Informe informe){
    
        System.out.println("Se exportó el informe: " + informe.getIdInforme() + " correctamente en formato Excel");
    
    }

}
