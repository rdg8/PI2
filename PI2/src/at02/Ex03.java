/*
 *3.	Construa um programa que escreva por extenso um número digitado pelo usuário 
(ou seja, se o usuário digitar “9”, deverá ser exibido no console “NOVE”). 
O programa deve escrever os números por extenso de 0 a 9 e, caso o número seja 
negativo ou tenha mais de uma casa decimal (maior que 9), mostrar uma mensagem de erro.
O código que efetua a leitura e a validação dos valores e o código que obtém o valor por
extenso devem ser separados em métodos diferentes.
 */
package at02;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Ex03 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Numero: ");
        int n = entrada();
        boolean nValido=verifica(n);
        if(nValido){
              escreveNumero(n);  
            }
        else{
            System.err.println("Erro! \nnúmero invalido");
            }
        }
    
    static int entrada(){
        int entrada = input.nextInt();
        return entrada;
    }
    
    static boolean verifica(int i){
        boolean nValido=false;
        if((i<=9) && (i>=0)){
            return nValido=true;
        }
        return nValido;
    }

    static void escreveNumero(int n){
         switch(n){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SETE");
                break;
            case 8:
                System.out.println("OITO");
                break;
            case 9:
                System.out.println("NOVE");
                break;
        }
    }

}
