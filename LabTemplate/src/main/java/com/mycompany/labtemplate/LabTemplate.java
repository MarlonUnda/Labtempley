
package com.mycompany.labtemplate;

public class LabTemplate {

    public static void main(String[] args) {
        ProcesarOrden compraEnLinea = new CompraEnLinea();
        ProcesarOrden compraFisica = new CompraFisica();
        
        System.out.println("=======================================================================");
        System.out.println("======================REALIZANDO COMPRA EN LINEA=======================");
        compraEnLinea.hacerCompra();

        System.out.println("========REALIZANDO COMPRA FISICA=========");
        compraFisica.hacerCompra();
     
    }
}
