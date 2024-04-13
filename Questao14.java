/*14.	Escreva um código Java que lê a nota de um aluno e verifica se ele foi aprovado ou reprovado. */
package com.mycompany.listaderevisaoii;
import java.util.Scanner;

public class Questao14 {
    public static void main (String[] args){
    
        Scanner ler = new Scanner (System.in);
        
        double nota;
        
        System.out.print("Qual foi sua nota: ");
        nota = ler.nextDouble();
        
        if (nota >= 60){
            
            System.out.print("APROVADO!!!\nPARABÉNS");
            
        }else {
            
            System.out.print("REPROVADO");
            
        }
        
    }
}
