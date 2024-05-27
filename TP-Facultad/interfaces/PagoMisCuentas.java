package interfaces;

public class PagoMisCuentas  implements IMedioDePago{
	
	public PagoMisCuentas() {
    }


    public void pagar(Double precio){
    	System.out.println("Pagando con PagoMisCuentas. El monto a pagar es de: " + precio);

    }
}
