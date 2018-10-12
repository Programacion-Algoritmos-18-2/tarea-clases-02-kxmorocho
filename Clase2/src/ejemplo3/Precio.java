/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author TOSHIBA
 */
public class Precio {

    private double euros;

    public double obtener() {
        return euros;
    }

    public double agregar(double x) {
        euros = x;
        return 0;
    }

    public Precio() {
        agregar(30.2);
    }
    
    public Precio (double y){
        agregar(y);
    }
            
}
