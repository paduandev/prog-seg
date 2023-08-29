package exemplo4;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite um número inteiro:");
        numero1 = entrada.nextInt();
        System.out.println("Digite um outro inteiro:");
        numero2 = entrada.nextInt();

        System.out.println("A soma é " + (numero1 + numero2));

        entrada.close();
    }
}
