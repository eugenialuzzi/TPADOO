package interfaces;

import java.util.*;


public class MercadoPago implements IMedioDePago {

    public MercadoPago() {
    }


    public void pagar(Double precio) {
    	System.out.println("Pagando con MercadoPago. El monto a pagar es de: " + precio);

    }

}