/*
 * 8.	Solicite ao usuário diversos números (pedindo a quantidade de números previamente) e, 
em seguida, localize o maior número digitado entre todos os valores. Ao final, o programa deverá 
exibir em qual “rodada” de digitação o maior número foi digitado.
 */
package at02;

import java.util.Scanner;


public class Ex08 {
    
    static Scanner input=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Quantidade de numero que sera inserido: ");
        int quantidade=input.nextInt();
        System.out.print("Numero:");
            int n=input.nextInt();
            int nMaior=n,posicao=1;
            
        for (int i = 2; i <= quantidade; i++) {
            System.out.print("Numero:");
            n=input.nextInt();
            if(n<nMaior){
                nMaior=n;
                posicao=i;
            }
        }
        System.out.println("\nmaior numero: "+nMaior);
        System.out.println("o maior numeor foi "+posicao+"º digitado");
        
        
    }
    
    
    
    
}
