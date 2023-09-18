package dowhile;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        // leia um valor entre 1 e 10
        // não aceite valores inválidos

        Scanner entrada = new Scanner(System.in);
        int numero;

        // numero = 0;
        // while(numero < 1 || numero > 10) {
        //     System.out.println("Digite um valor entre 1 e 10");
        //     numero = entrada.nextInt();
        // }

        do {
            System.out.println("Digite um valor entre 1 e 10");
            numero = entrada.nextInt();
        } while(numero < 1 || numero > 10);

        entrada.close();
    }
}
