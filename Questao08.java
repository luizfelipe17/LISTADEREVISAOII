/*8 - Escreva um código Java que verifica se um número é par ou ímpar. */

package com.mycompany.listaderevisaoii;
import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        System.out.print("Informe um número: ");
        int numero = ler.nextInt();
        
        if (numero % 2 == 0){
            
            System.out.println("\nO NÚMERO É PAR");
            
        } else {
            
            System.out.println("\nO NÚMERO É íMPAR");
            
        }
        
    }
}
