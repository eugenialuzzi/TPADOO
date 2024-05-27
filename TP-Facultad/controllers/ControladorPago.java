package controllers;

import java.util.*;

import interfaces.Binance;
import interfaces.IMedioDePago;
import interfaces.MercadoPago;
import interfaces.PagoMisCuentas;

/**
 * 
 */
public class ControladorPago {

	private static ControladorPago instance;
    public ControladorPago() {
    }

    public static ControladorPago getInstance() {

        if (instance == null) {

            instance = new ControladorPago();

        }

        return instance;

    }
    public void pagar(Double precio){
        System.out.println("El monto a pagar es de: " + precio);
    }
    
    public IMedioDePago seleccionarMedioDePago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el medio de pago:");
        System.out.println("1. MercadoPago");
        System.out.println("2. PagoMisCuentas");
        System.out.println("3. Binance");
        
        int opcion = scanner.nextInt();
        scanner.close();

        if (opcion == 1) {
        	System.out.println("Pago Exitoso");
            return new MercadoPago();
        } else if (opcion == 2) {
        	System.out.println("Pago Exitoso");
            return new PagoMisCuentas();
        } else if (opcion == 3) {
        	System.out.println("Pago Exitoso");
            return new Binance();
        } else {
            System.out.println("Opción inválida.");
            return null;
        }
    }

}