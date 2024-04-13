/*9.	Escreva um código Java que verifica se um usuário é maior de idade. */
package com.mycompany.listaderevisaoii;
import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        int idade = 0;
        
        System.out.print("Olá,\nInforme sua idade: ");
        idade = ler.nextInt();
        
        while (idade < 0){
            
            System.out.println("Informe uma valor válido");
            idade = ler.nextInt();
            
        }
        
        if (idade >= 18){
            
            System.out.print("MAIOR DE IDADE");
            
        }else {
            
            System.out.print("MENOR DE IDADE");
            
        }
        
    }
}
