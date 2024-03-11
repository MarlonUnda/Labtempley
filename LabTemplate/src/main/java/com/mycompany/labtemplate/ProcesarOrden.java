// es abstracta
package com.mycompany.labtemplate;

public abstract class ProcesarOrden {
   // 3 metodos publicos abstractos que no retornan nada
   // 1: seleccionar producto
   // 2: hacer pago
   // 3: distribuir
   // 4: llamar a los otros 3 y que se llame hacerCompra
    
    
    public abstract void seleccionarProducto();
    
    public abstract void hacerPago();
    
    public abstract void distribuir();
    
    public void hacerCompra(){
        seleccionarProducto();
        hacerPago();
        distribuir();
    }
    
}
