/*
 * 7.	Elabore um programa que calcule a média geral de uma sala. Para isso, solicite ao usuário
a quantidade de alunos e, em seguida, a média final de cada um deles. Ao término, calcule a média da sala 
e a exiba ao usuário.
 */
package at02;

import java.util.Scanner;


public class Ex07 {
    
    static Scanner input=new Scanner(System.in);
    
    public static void main(String[] args) {
        float somasNotas=0,nota=0;
        System.out.print("quantidade de alunos: ");
        int alunos=quantidadeAluno();
        for(int i=1;i<=alunos;i++){
            System.out.print("Nota aluno "+i+ ": ");
            nota=input.nextFloat();
            somasNotas=somaNotas(nota, somasNotas);
        }
        float media=media(alunos,somasNotas);
        System.out.println("Meia dos alunos= "+media);
    }
    
    static int quantidadeAluno(){
        int n=input.nextInt();
        return n;
    }
    
 
    
    static float media(int alunos,float somaNota){
        float media = somaNota/alunos;
        return media;
    }
    
    static float somaNotas(float nota,float somarNotas){
       somarNotas+=nota;
        return somarNotas;
    }
    
}
