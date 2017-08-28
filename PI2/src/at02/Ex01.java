/*
 * 1.	Escreva um programa que leia um número decimal do usuário. Após a leitura,
verifique se o número é maior ou igual a 50,0. Caso verdadeiro, mostre a mensagem 
“SUCESSO”. Caso falso, mostre a mensagem “ERRO”. Após a verificação, saia do programa 
emitindo a mensagem “FIM DO PROGRAMA”, independentemente do resultado. Construa o programa 
de forma que os métodos de leitura e verificação fiquem separados do método principal da aplicação.
 */
package at02;

import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Ex01 {

   static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args) {
        System.out.print("Número: ");
        double n = entradaDouble();
        maior50(n);
        System.out.println("FIM DO PROGRAMA");
        
    }
    
    static double entradaDouble(){
        double entrada = input.nextDouble();
        return entrada;
    }
    
    
    static void maior50(double entrada){
        boolean maior=false;
        if(entrada>=50){
            System.out.println("SUCESSO");
        }
        else{
            System.out.println("ERRO");
        }
        
    }
}
