/*13.	Escreva um código Java que lê três números e verifica qual é o maior. */
package com.mycompany.listaderevisaoii;
import java.util.Scanner;

public class Questao13 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double [] numeros = new double[3];
        
        for (int i = 0; i < numeros.length; i++){
        
                System.out.print("Infome um número: ");
                numeros[i] = ler.nextDouble();
               
        }
        
        double maiorNumero = Math.max(numeros[0], Math.max(numeros[1], numeros[2]));
        
        System.out.printf("\nO maior número informado foi: %.2f", maiorNumero);
        System.out.print("");
        
    }
}
