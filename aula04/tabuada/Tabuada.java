package tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;

        System.out.println("Informe o número da tabuada(de 1 à 10):");
        numero = entrada.nextInt();

        if(numero < 1 || numero > 10) {
            System.out.println("Número inválido");
        } else {
            // cont = 0;
            // while (cont < 11) {
            //     System.out.println(numero + " X "+ cont + " = " + (numero * cont));
            //     cont++;
            // }

            for(cont = 0 ; cont < 11 ; cont++) {
                System.out.println(numero + " X "+ cont + " = " + (numero * cont));
            }

        }

        entrada.close();
    }
}
