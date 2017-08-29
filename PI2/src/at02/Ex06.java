/*
 * 6.	Escreva um programa que exiba uma tabuada do 1 ao 9, de acordo com o seguinte formato
(utilize instruções de repetição para elaboração da tabuada):
 */
package at02;

import java.util.Scanner;


public class Ex06 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int matix[][]=iniciaMatix();
        matix=populaMatix(matix);
        matix=populaLadosMatix(matix);
        imprimiMatix(matix);
        
    }
    
    static int[][] populaMatix(int matix[][]){
        for(int i=0;i<matix.length;i++){        
            for(int j=0;j<matix[i].length;j++){
                matix[i][j]=j*i;
            }
        }
        return matix;
    }
    
    static int[][] iniciaMatix(){
        int [][]matix=new int[10][10];
        return matix;
    }
    
    static void imprimiMatix(int matix[][]){
        for(int i=0;i<matix.length;i++){
            for(int j=0;j<matix[i].length;j++){
                System.out.print(matix[i][j]);
                 System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
   static int[][] populaLadosMatix(int [][]matix){
        for(int i=0;i<matix.length;i++){        
            for(int j=0;j<matix[i].length;j++){
                if(i==0){
                    matix[i][j]=j;
                }
                if(j==0){
                    matix[i][j]=i;
                }
            }
            
        }
       return matix;
   }
   
   
}
