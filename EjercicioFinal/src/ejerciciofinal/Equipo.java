/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author TOSHIBA
 */
public final class Equipo {
    
    String nombre;

    int num_jugadores;

    String ciudad;

    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_nombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtener_numJug() {
        return num_jugadores;
    }

    public void agregar_numJug(int num_jugadores) {
        this.num_jugadores = num_jugadores;
    }

    public String obtener_ciudad() {
        return ciudad;
    }

    public void agregar_ciudad(String ciudad) {
        this.ciudad = ciudad;
    }
    //contructor por defecto
    public Equipo() {
    }
    //contructor para el nombre
    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    //contructor para el nombre y numero de jugadores
    public Equipo(String nombre, int num_jugadores) {
        this.nombre = nombre;
        this.num_jugadores = num_jugadores;
    }
    //contructor para el nombre, numero de jugadores y ciudad
    public Equipo(String nombre, int num_jugadores, String ciudad) {
        this.nombre = nombre;
        this.num_jugadores = num_jugadores;
        this.ciudad = ciudad;
    }
    
    
}
    
    
