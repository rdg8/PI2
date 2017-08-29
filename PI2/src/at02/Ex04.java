/*
 * 4.	Elabore um programa que solicite 5 números do usuário utilizando alguma forma 
de repetição (while, do...while ou for). Em seguida, calcule a média aritmética do valor
e exiba as seguintes mensagens de acordo com os critérios abaixo:
a.	Se a média for menor que 5, exibir “REPROVADO”
b.	Se a média for maior ou igual a 5 e menor que 9, exibir “APROVADO”
c.	Se a média for 9, exibir “PARABÉNS”
d.	Se a média for 10, exibir “MASTER OF THE UNIVERSE”

 */
package at02;

import java.util.Scanner;


public class Ex04 {
    
    static Scanner input=new Scanner(System.in);
    
    public static void main(String[] args) {
        int provas=5;
        double media=0,somaNotas=0;
        
       for(int i=1;i<=provas;i++){
           System.out.print(i +"ª Nota: ");
           double nota=nota();
           somaNotas=somaNotas(nota,somaNotas); 
       }
        media =  media(somaNotas, provas);
         verificaNota(media);
    }
    
    static double nota(){
        double n=input.nextDouble();
        return n;
    }
    
    static double media(double notas,int N){
        double media = notas/N;
        return media;
    }
    
    static void verificaNota(double media){
        if(media<5){
            System.err.println("REPROVADO");
            System.out.println("Media = "+media);
        }
        else if(media<9){
            System.out.println("APROVADO");
            System.out.println("Media = "+media);
        }
        else if(media==9){
            System.out.println("PARABÉNS");
            System.out.println("Media = "+media);
        }
        else if(media==10){
            System.out.println("MASTER OF THE UNIVERSE"); 
            System.out.println("Media = "+media);
        }
    }
    
    static double somaNotas(double n, double somaNotas){
        somaNotas=somaNotas + n;
        return somaNotas;
    }
}
