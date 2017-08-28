/*
 * 2.	Escreva um programa Java que verifique se um número digitado pelo usuário 
é um número e, caso verdadeiro, se é um número par ou ímpar, bem como um número 
primo. Exiba os resultados no console com mensagens amigáveis ao usuário. 
As lógicas de obtenção do número e ambas as verificações devem ser separadas em
métodos diferentes.
 */
package at02;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Ex02 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Número: ");
        double entrada=entrada();
        boolean par=par(entrada);
        if(!par || (entrada==2)){
            primo(entrada);
        }
        else{
            System.out.println(entrada+" Não é primo");
        }
        
        
    }
    
    static boolean par(double entrada){
        boolean par= false;
        double resto = entrada%2;
        if(resto==0){
            System.out.println(entrada+" É par");
            return par=true;
        }
        else{
            System.out.println(entrada+" É impar");
            return par;
        }
    }
    
    static void primo(double entrada){
        int contador=0;
        for(int i=1;i<entrada;i++){
            double primo=entrada%i;
            if(primo==0){
                contador++;
            }
        }
        if(contador==1){
            System.out.println(entrada+" É primo");
        }
        else{
            System.out.println(entrada+" Não é primo");
        }
    }
    
    static double entrada(){
        double entrada=input.nextDouble();
        return entrada;
    }
    
}
