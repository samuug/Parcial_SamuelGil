package org.example.JuegoVida;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente= new int[DIMENSION][DIMENSION];

    public Tablero() {
        estadoActual = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public void imprimirTablero() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (estadoActual[i][j]==1){
                    System.out.print("x ");
                } else if (estadoActual[i][j]==0) {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
    public void leerEstadoActual(){
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                reglas(i,j);
            }
        }
    }
    public void reglas(int i, int j){
        int contLife=0;
        if (i!=0 && i!=DIMENSION-1 && j!=0 && j!=DIMENSION-1){//dentro del tablero sin los bordes
            for (int k = i-1; k <= i+1; k++) {
                for (int l = j-1; l <= j+1; l++) {
                    if (estadoActual[k][l]==1){
                        contLife++;
                    }
                }
            }
            if (estadoActual[i][j]==1 && contLife<2){
                estadoSiguiente[i][j]=0;
            } else if (estadoActual[i][j]==0 && contLife>=3) {
                estadoSiguiente[i][j]=1;
            }
        } else if (i==0 && j==0){//esquina superior izq
            for (int k = i; k <= i+1; k++) {
                for (int l = j; l <= j+1; l++) {
                    if (estadoActual[k][l]==1){
                        contLife++;
                    }
                }
            }
            if (estadoActual[i][j]==1 && contLife<2){
                estadoSiguiente[i][j]=0;
            } else if (estadoActual[i][j]==0 && contLife>=3) {
                estadoSiguiente[i][j]=1;
            }
        } else if (i==0 && j==DIMENSION-1) {//esquina superior der
            for (int k = i; k <= i+1; k++) {
                for (int l = j-1; l < DIMENSION; l++) {
                    if (estadoActual[k][l]==1){
                        contLife++;
                    }
                }
            }
            if (estadoActual[i][j]==1 && contLife<2){
                estadoSiguiente[i][j]=0;
            } else if (estadoActual[i][j]==0 && contLife>=3) {
                estadoSiguiente[i][j]=1;
            }
        } else if (i==DIMENSION-1 && j==0){//esquina inferior izq
            for (int k = i-1; k < DIMENSION; k++) {
                for (int l = j; l <= j+1; l++) {
                    if (estadoActual[k][l]==1){
                        contLife++;
                    }
                }
            }
            if (estadoActual[i][j]==1 && contLife<2){
                estadoSiguiente[i][j]=0;
            } else if (estadoActual[i][j]==0 && contLife>=3) {
                estadoSiguiente[i][j]=1;
            }
        } else if (i==DIMENSION-1 && j==DIMENSION-1) {//esquina inferior der
            for (int k = i-1; k < DIMENSION; k++) {
                for (int l = j-1; l < DIMENSION; l++) {
                    if (estadoActual[k][l]==1){
                        contLife++;
                    }
                }
            }
            if (estadoActual[i][j]==1 && contLife<2){
                estadoSiguiente[i][j]=0;
            } else if (estadoActual[i][j]==0 && contLife>=3) {
                estadoSiguiente[i][j]=1;
            }
        }
    }

    public void generarEstadoActualPorMontecarlo(){
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                double numero = ((double)(Math.random()*10)/10);
                if (numero<=0.2){
                    estadoActual[i][j] = 1;
                } else {
                    estadoActual[i][j] = 0;
                }
            }
        }
    }
    public void transitarAlEstadoSiguiente(){
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j]=estadoSiguiente[i][j];
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(estadoActual);
    }

    public static void main(String[] args) {


    }

}
