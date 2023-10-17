package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int TOTAL_CARROS = 5;
        int composicao[] = new int[TOTAL_CARROS];
        int totalPassageiros = 0;

        for (int i = 0; i < composicao.length; i++) {
            do {
                System.out.println("Quantos passageiros tem o carro " + (i + 1) + " (de 0 à 250):");
                composicao[i] = teclado.nextInt();
            } while (composicao[i] < 0 || composicao[i] > 250);
            totalPassageiros += composicao[i];
        }

        for (int i = 0; i < composicao.length; i++) {
            System.out.print("carro " + (i + 1) + ": " + composicao[i] + " ");
            if (composicao[i] < 51) {
                System.out.println("Azul");
            } else {
                if (composicao[i] < 101) {
                    System.out.println("Amarela");
                } else {
                    if (composicao[i] < 151) {
                        System.out.println("Laranja");
                    } else {
                        System.out.println("Vermelha");
                    }
                }
            }
        }

        System.out.println("Total passageiros: " + totalPassageiros);

        teclado.close();
    }
}
