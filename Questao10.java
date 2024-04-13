/*10.	Escreva um código Java que calcula o desconto de um produto com base em seu valor original. */
package com.mycompany.listaderevisaoii;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        
        Scanner ler = new Scanner (System.in);
        
        double valorSemDesconto, valorComDesconto;
        
        System.out.print("Informe o valor sem o desconto: R$");
        valorSemDesconto = ler.nextDouble();
        System.out.print("Informe o valor com o desconto: R$");
        valorComDesconto = ler.nextDouble();
        
        double valor = valorSemDesconto - valorComDesconto;
        
        double desconto = valor * 100 / valorSemDesconto;
        
        System.out.printf("O desconto foi de %.2f",desconto);
        System.out.print("%");
        
    }
}
