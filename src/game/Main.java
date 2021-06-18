package src.game;

import src.tableboard.*;

public class Main {

    /*
        Mi idea es comenzar pidiendo 5 jugadores (aunque solo se elegira a 2) que se almacenaran
        en el vectorJugadores, luego crear un tablero, llenarlo con los colores... Luego crear
        2 tipos de fichas y un arreglo de fichas que pida tenga como parametro un tablero creado 
        y se llene con fichas1 arriba y las fichas 2 abajo... -Virnes
    */
    public static void main(String[] args){
        System.out.println("(Pinch* Ant no corria)");
        System.out.println("\n\n * * *Bienvenido al Juego de Damas * * * \n\n");
        Tablero tablero = new Tablero(); //Se crea un objeto tablero de tipo Tablero que es un array
        tablero.llenarTablero(); //Se llena el tablero con los espacios blancos y negros
        Ficha ficha = new Ficha(tablero); //Se crea(n) objetos fichas de tipo Ficha para ingresar en un tablero ya existente
        ficha.addFichaEnTablero(); //Se usa el metodo agregar ficha al tablero
    }
}
