
package com.mycompany.labtemplate;

public class CompraEnLinea extends ProcesarOrden {

    @Override
    public void seleccionarProducto() {
        System.out.println("=======================================================================");
        System.out.println("========Compra en linea=========");
        System.out.println("Seleccione un producto");
        System.out.println("Agregarlo en el carro de compras");
        System.out.println("Confirmar");
    }

    @Override
    public void hacerPago() {
        System.out.println("========Realizar pago=========");
        System.out.println("Agregue la direccion");
        System.out.println("Seleccione la forma de pago");
        System.out.println("Realice el pago");
    }

    @Override
    public void distribuir() {
        System.out.println("========distribuir el producto=========");
        System.out.println("Su producto sera entregado en 3 o 4 dias laborables");
        System.out.println("Continue comprando");
        System.out.println("=======================================================================");
        
        
    }

    
}
