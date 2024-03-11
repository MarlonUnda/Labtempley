
package com.mycompany.labtemplate;

public class CompraFisica extends ProcesarOrden{

    @Override
    public void seleccionarProducto() {
        System.out.println("=======================================================================");
        System.out.println("========Compra Fisica=========");
        System.out.println("Seleccionar un producto");
        System.out.println("Llevar a la caja");
    }

    @Override
    public void hacerPago() {
        System.out.println("========Realizar el pago correspondiente=========");
        System.out.println("hacer fila");
        System.out.println("entregar el producto");
        System.out.println("pagar");
    }

    @Override
    public void distribuir() {
        System.out.println("========Llevarse el producto adquirido=========");
        System.out.println("recoger el producto adquirido");
        System.out.println("llevarse el producto");
        System.out.println("ir a la casa");
        System.out.println("=======================================================================");
    }
    
}
