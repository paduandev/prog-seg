package exemplo01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;

        do {
            try {
                System.out.println("Digite um valor inteiro:");
                numero = entrada.nextInt();
                numeroValido = true;
            } catch (InputMismatchException ex) {
                System.out.println("Erro de digitação.");
                entrada.nextLine();
            }
        } while (!numeroValido);

        System.out.println("Você digitou: " + numero);

        entrada.close();
    }
}