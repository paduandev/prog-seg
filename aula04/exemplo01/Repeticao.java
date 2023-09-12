
package exemplo01;

import java.util.Scanner;

/*
 *  while = enquanto
 *  repete o bloco de comandos enquanto a condição for verdadeira
 */

public class Repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador, limite;

        System.out.println("Informe o limite da contagem:");
        limite = scanner.nextInt();

        contador = 1; // inicialização

        while(contador <= limite) { // condição 
            System.out.println(contador);
            contador = contador + 1; // passo
        }

        scanner.close();
    }
}
