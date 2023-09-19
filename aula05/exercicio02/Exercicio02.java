package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, cont, contPares = 0, contImpares = 0;
        int somaPares = 0;
        
        for (cont = 1; cont < 11; cont++) {
            System.out.println("Digite um valor inteiro:");
            numero = teclado.nextInt();
            if(numero % 2 == 0) {
                contPares++;
                somaPares = somaPares + numero;
            } else {
                contImpares++;
            }
        }
        System.out.println("Média pares = " + (double)somaPares / contPares);
        System.out.println("% impares = " + contImpares * 10 + " %");
        teclado.close();
    }
}