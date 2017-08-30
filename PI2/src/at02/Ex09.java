/*
 *9. Escreva um programa que questione ao usuário as duas aulas que ele terá a cada dia da semana.
Em seguida, permita que o usuário consulte quais aulas terá em determinado dia da semana ou imprima as
aulas de todos os dias da semana. O programa só deverá ser encerrado quando o usuário digitar “sair”,
a qualquer momento.
 */
package at02;

import java.util.Scanner;

public class Ex09 {
    static Scanner input= new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean sair=false;
        String aulas[]=entrada();
        aulas=aulas(aulas);
        do{
            System.out.println("Escolha um dia da semana \ndigite todas para ver todas as aulas\n ou digite sair:");
            String dia=input.next();
            sair=opcoes(dia, aulas);
        }while(!sair);
    }
    
    static String[] entrada(){
        String aula[]= new String [14];
        return aula;
    }
    
    static boolean opcoes(String dia, String vetor[]){
        switch(dia){
            case "1":
            case "domingo":
                System.out.println("Aulas de Domingo");
                for(int i=0;i<=1;i++){
                    System.out.println(vetor[i]);
                }
                break;
            case "2":
            case "segunda":
                System.out.println("Aulas de Segunda");
                for(int i=2;i<=3;i++){
                    System.out.println(vetor[i]);
                }
                break;
            case "3":
            case "terça":
                System.out.println("Aulas de Terça");
                for(int i=4;i<=5;i++){
                    System.out.println(vetor[i]);
                }
             break;
            case "4":
            case "quarta":  
                System.out.println("Aulas de Quarta");
                for(int i=6;i<=7;i++){
                    System.out.println(vetor[i]);
                }
                break;
            case "5":
            case "quinta":
                System.out.println("Aulas de Quinta");
                for(int i=8;i<=9;i++){
                    System.out.println(vetor[i]);
                }
                break;
            case "6":
            case "sexta":
                System.out.println("Aulas de Sexta");
                for(int i=10;i<=11;i++){
                    System.out.println(vetor[i]);
                }
                break;
            case "7":
            case "sabado":
                System.out.println("Aulas de Sabado");
                for(int i=12;i<=13;i++){
                    System.out.println(vetor[i]);
                }
                break;
            case "0":
            case "sair":
               boolean sair=true;
               return sair;  
            case "todas":
                System.out.println("todas as aulas da semana: ");
                 imprimirVetor(vetor);
                 break;
            default:
                System.out.println("ERRO digite um numero de 0 a 7 ou um dia da semana");
        }
        
        boolean sair=false;
        return sair;
        
    }
    
    static String[]  aulas(String aulas[]){
        int d=1;
        int a=1;
        for (int i = 0; i < aulas.length;i++){
            System.out.print("Dia"+d+" da semana \n aula "+a+" ");
            a++;
            aulas[i]=input.next();    
            if(i%2!=0 || i==1){
                System.out.println("");
                d++;
                a=1;
            }
            
        }
   
        return aulas;
    }
    
   static void imprimirVetor(String vetor[]){
        int d=1,a=0;
        
        for (int i = 0; i < vetor.length; i++) {
            a++;
                  
            if(a>2){
                System.out.println("");
                d++;
                a=1;
            }
            System.out.print("\n Dia"+d+"\n aula"+a+" "+vetor[i]);
            
        }
    }
    
}
