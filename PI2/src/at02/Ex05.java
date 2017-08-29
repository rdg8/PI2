/*
 * 5.	Construa um programa Java que gere um número aleatório (utilizando a classe java.util.Random) 
e peça que o usuário adivinhe o número. O programa deverá ler dados do usuário até que ele acerte o número 
(exibindo uma mensagem de sucesso) ou ele digite “desistir” (onde uma mensagem de falha junto ao número que 
deveria ser adivinhado deverá ser exibida). Separe a lógica dos métodos de forma coesa.
 */
package at02;

import java.util.Random;
import java.util.Scanner;


public class Ex05 {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int numeroSorteado=sorteio();
            System.out.println("numero soteado foi"+numeroSorteado);
        boolean acerto = false, desistir=false;
        System.out.println("Adivinhe o número no D20");
        do{
            System.out.print("\ndigite desistir para sair ou um Numero para continuar: ");
            String numero=input.next();
            desistir=desistiu(numero);
            if(!desistir){
                int n=conveteStringEmInt(numero);
                acerto = tentativa(n, numeroSorteado);
            }
        }while((!acerto) && (!desistir));
        System.out.println("Numero sorteado foi: "+numeroSorteado);
    }
    
    static int sorteio(){
    Random d20 = new Random();
    int numeroSorteado = d20.nextInt(19+1);
    return numeroSorteado;
    }
    
    static boolean tentativa(int n, int numeroSorteado){
        boolean acerto=false;
        if(n==numeroSorteado){
            System.out.println("Acerto mizeravi");
            return acerto = true;
        }
        System.out.println("Errouuuu");
        return acerto;
    }
    
    static boolean desistiu(String numero){
    boolean desistiu=false;
        if(numero.equals("desistir")){
            return desistiu =true;
        }
    return desistiu;
    }
    
    static int conveteStringEmInt(String numero){
        int n = Integer.parseInt(numero);
        return n;
    }
    
}
