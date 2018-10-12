
package ejerciciofinal;

/**
 *
 * @author TOSHIBA
 */
public class principal {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Equipo eq;
        eq = new Equipo();
        
        System.out.println("Nombre%s"+ eq.obtener_nombre()+"Jugadores %s"+ eq.obtener_numJug()+"Ciudad %s"+ eq.obtener_ciudad());
        
        Equipo e2 = new Equipo("Liga de Loja");
        e2.agregar_numJug(20);
        e2.agregar_ciudad("Loja");
        
        System.out.println("Nombre%s"+ eq.obtener_nombre()+"Jugadores %s"+ eq.obtener_numJug()+"Ciudad %s"+ eq.obtener_ciudad());
        
        
   
    }
    
}
