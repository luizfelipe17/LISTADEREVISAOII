/*15.	Escreva um código Java que lê o salário de um funcionário e calcula o seu imposto de renda. */
package com.mycompany.listaderevisaoii;
import java.util.Scanner;

public class Questao15 {
    public static void main (String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double salario, impostoDeRenda = 0;
        
        System.out.print("Informe o seu salário: ");
        salario = ler.nextDouble();
        
        if (salario <= 2259.20){
            
            System.out.print("\nIMPOSTO ISENTO");
            
        }else if (salario > 2259.20 && salario <= 2826.65){
            
            impostoDeRenda = (salario * 0.075) - 169.44;
            System.out.printf("\nVocê deverá pagar de imposto de renda: R$%.2f", impostoDeRenda);
            
        }else if (salario >= 2826.66 && salario <= 3751.05){
            
            impostoDeRenda = (salario * 0.15) - 381.44;
            System.out.printf("\nVocê deverá pagar de imposto de renda: R$%.2f", impostoDeRenda);
            
        }else if (salario >= 3751.06 && salario <=  4664.68){
            
            impostoDeRenda = (salario * 0.225) - 662.77;
            System.out.printf("\nVocê deverá pagar de imposto de renda: R$%.2f", impostoDeRenda);
            
        }else {
            
            impostoDeRenda = (salario * 0.275) - 896;
            System.out.printf("\nVocê deverá pagar de imposto de renda: R$%.2f", impostoDeRenda);
            
        }

        
    }
}
