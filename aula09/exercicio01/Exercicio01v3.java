package exercicio01;

import java.util.Scanner;

public class Exercicio01v3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precoFabrica, precoFinal;
        char opcaoMenu;
        final int TOTAL_ITENS = 5;
        boolean opcional[] = new boolean[TOTAL_ITENS];
        String nomeItem[] = { "ar condicionado", "pintura metálica", "vidro elétrico", "direção elétrica",
                "câmbio automático" };
        double precoItem[] = { 1500, 800, 600, 2000, 4500 };

        System.out.println("Informe o preço de fábrica:");
        precoFabrica = Double.parseDouble(teclado.nextLine());

        do {
            char opcao = 'a';
            for (int i = 0; i < TOTAL_ITENS; i++) {
                if (!opcional[i])
                    System.out.println(opcao + ". " + nomeItem[i]);
                opcao++;
            }
            System.out.println("f. encerrar");
            System.out.println("Escolha o opcional:");
            opcaoMenu = teclado.nextLine().charAt(0);

            if (opcaoMenu >= 'a' && opcaoMenu < 'f') {

                int indice = opcaoMenu - 'a'; // utiliza valor da tabela ASCII

                if (opcional[indice]) {
                    System.out.println("Item já escolhido");
                } else {
                    precoFabrica += precoItem[indice];
                    opcional[indice] = true;
                }
            } else {
                if (opcaoMenu != 'f') {
                    System.out.println("Opção inválida");
                }
            }
        } while (opcaoMenu != 'f');

        precoFinal = precoFabrica * 1.03;
        System.out.println("Preço final: R$ " + precoFinal);
        System.out.println("Itens inclusos:");
        for (int i = 0; i < opcional.length; i++) {
            if (opcional[i] == true) {
                System.out.println("- " + nomeItem[i]);
            }
        }

        teclado.close();
    }
}
