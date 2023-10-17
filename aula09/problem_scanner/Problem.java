package problem_scanner;

import java.util.Scanner;

/**
 * Problema de entrada de dados com Scanner
 */
public class Problem {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String texto;

        // O problema do 'ENTER' no buffer.
        System.out.println("Digite um número:");
        numero = entrada.nextInt();
        System.out.println("Digite um texto:");
        texto = entrada.nextLine(); // Como temos um "Enter" no buffer, você não consegue digitar aqui

        // Possíveis soluções:
        // 1. Usar 2 Scanner's: um para Int e outro para String
        // 2. fazer um scanner.nextLine() depois de cada leitura do int para 'limpar' o 'Enter' do buffer
        // 3. ler tudo como String e converter para o tipo numérico.
        // Exemplo:
        // numero = Integer.parseInt( entrada.nextLine() );
    }
}