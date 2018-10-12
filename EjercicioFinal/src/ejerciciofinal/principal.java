package ejerciciofinal;

/**
 *
 * @author TOSHIBA
 */
public class principal {

    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración una variable y creación de un objeto de Equipo
        Equipo eq;
        eq = new Equipo();

        System.out.printf("Nombre: %s - Jugadores: %s - Ciudad: %s",eq.obtener_nombre(),eq.obtener_numJug(),eq.obtener_ciudad());

        // Creación de objeto eq
        Equipo e2 = new Equipo("Liga de Loja");
        e2.agregar_numJug(20);
        e2.agregar_ciudad("Loja");
        

        System.out.printf("\nNombre: %s - Jugadores: %s - Ciudad: %s",e2.obtener_nombre(),e2.obtener_numJug(),e2.obtener_ciudad());

        //creación de objeto e3
        Equipo e3 = new Equipo("Nacional",24);
        e3.agregar_ciudad("Quito");

        System.out.printf("\nNombre: %s - Jugadores: %s - Ciudad: %s",e3.obtener_nombre(),e3.obtener_numJug(),e3.obtener_ciudad());
        
        //creación de objeto e4
      
        Equipo e4 = new Equipo("LDU",24,"Quito");

        System.out.printf("\nNombre: %s - Jugadores: %s - Ciudad: %s",e4.obtener_nombre(),e4.obtener_numJug(),e4.obtener_ciudad());
    }

}
