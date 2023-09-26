package exercicio;

import java.util.Random;

public class Exercicio {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            // gera 1 número inteiro aleatório entre 1 e 100
            numeros[i] = gerador.nextInt(100) + 1;
            System.out.println(numeros[i]);
        }
        
        // procura o maior valor ...
        
    }
}
