/*11.	Escreva um código Java que simula o jogo de pedra, papel e tesoura. */
package com.mycompany.listaderevisaoii;

import java.util.Scanner;
import java.util.Random;

public class Questao11 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner ler = new Scanner(System.in);

        String[] escolhas = {"PEDRA", "PAPEL", "TESOURA"};
        String escolhasUsarios;

        int escolha = aleatorio.nextInt(escolhas.length);
        String escreverEscolha = escolhas[escolha];

        System.out.print("Escolha 'PEDRA', 'PAPEL', 'TESOURA': ");
        escolhasUsarios = ler.next();

        if (escolhasUsarios.equalsIgnoreCase(escreverEscolha)) {

            System.out.println("\nEMPATE!\nESCOLHI " + escreverEscolha);

        } else if (escolhasUsarios.equalsIgnoreCase("pedra") && escolha == 1
                || escolhasUsarios.equalsIgnoreCase("tesoura") && escolha == 0
                || escolhasUsarios.equalsIgnoreCase("papel") && escolha == 2) {

            System.out.print("\nESCOLHI " + escreverEscolha);
            System.out.print("\nVocê perdeu");

        } else {

            System.out.print("\nESCOLHI " + escreverEscolha);
            System.out.print("\nVOCÊ GANHOUU!!! PARABÉNS");
        }
    }
}
