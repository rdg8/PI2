/*
 * 10.	Construa um programa que permita a elaboração de duas matrizes de mesmo tamanho 
(n por n) e, em seguida, exiba e calcule a soma destas matrizes.
 */
package at02;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;


public class Ex10 {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("tamanho da matriz: ");
        int tamanho=input.nextInt();
        System.out.println("\ntamanho da matriz1: ");
        int [][]matriz1=iniciaMatriz(tamanho);
        matriz1=populaMatriz(matriz1);
        System.out.println("\nDados matriz2");
        int [][]matriz2=iniciaMatriz(tamanho);
        matriz2=populaMatriz(matriz2);
        
        int [][]matriz3=somaMatriz(matriz1, matriz2, tamanho);
        System.out.println("soma das matrizes");
        imprimiMatriz(matriz3);
    }
    
    static int[][] iniciaMatriz(int x){
        int matriz[][] = new int [x][x];
        return matriz;
    }
    
    static int[][] populaMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("numero");
                matriz[i][j]=input.nextInt();
            }    
        }
        return matriz;
    }
    
    static int[][] somaMatriz(int matriz1[][],int matriz2[][], int tamanhoMatriz){
        int [][]matriz3=iniciaMatriz(tamanhoMatriz);
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        return matriz3;
    }
    
    static void imprimiMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                 System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
}
