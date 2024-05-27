package interfaces;

public class Binance implements IMedioDePago{
	
	public Binance() {
    }


    public void pagar(Double precio){
        System.out.println("Pagando con Binance. El monto a pagar es de: " + precio);

        
    }
    
    
}
