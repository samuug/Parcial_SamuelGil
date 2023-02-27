package org.example;

import org.example.AproximacionPi.AproximacionPi;
import org.example.JuegoVida.Tablero;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir=false;
        int opcion;
        do {
            System.out.println("1.- Práctica 1. Obtención de una aproximación al número pi");
            System.out.println("2.- Práctica 2. El juego de la vida");
            System.out.println("3.- Práctica 3. Búsqueda de un camino en un grafo");
            System.out.println("4.- Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    AproximacionPi.generarNumeroPi(1000000);
                    break;
                case 2:
                    Tablero tablero = new Tablero();
                    tablero.generarEstadoActualPorMontecarlo();
                    tablero.imprimirTablero();
                    for (int i = 0; i < 15; i++) {
                        System.out.println("Generación "+(i+1)+":");
                        tablero.leerEstadoActual();
                        tablero.transitarAlEstadoSiguiente();
                        tablero.imprimirTablero();
                        System.out.println();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        }while (!salir);
    }
}