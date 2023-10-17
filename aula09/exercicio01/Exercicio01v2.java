package exercicio01;

import java.util.Scanner;

public class Exercicio01v2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precoFabrica, precoFinal;
        char opcaoMenu;
        final int TOTAL_ITENS = 5;
        boolean opcional[] = new boolean[TOTAL_ITENS];
        String nomeItem[] = { "ar condicionado", "pintura metálica", "vidro elétrico", "direção elétrica", "câmbio automático" };
        double precoItem[] = { 1500, 800, 600, 2000, 4500 };

        System.out.println("Informe o preço de fábrica:");
        precoFabrica = Double.parseDouble(teclado.nextLine());

        do {
            char opcao = 'a';
            for (int i = 0; i < TOTAL_ITENS; i++) {
                if(!opcional[i])
                System.out.println(opcao + ". " +nomeItem[i]);
                opcao++;
            }
            System.out.println("f. encerrar");
            System.out.println("Escolha o opcional:");
            opcaoMenu = teclado.nextLine().charAt(0);

            switch (opcaoMenu) {
                case 'a':
                    if (opcional[0]) {
                        System.out.println("Item já escolhido");
                    } else {
                        precoFabrica += precoItem[0]; // precoFabrica = precoFabrica + 1500;
                        opcional[0] = true;
                    }
                    break;
                case 'b':
                    if (opcional[1]) {
                        System.out.println("Item já escolhido");
                    } else {
                        precoFabrica += precoItem[1];
                        opcional[1] = true;
                    }
                    break;
                case 'c':
                    if (opcional[2]) {
                        System.out.println("Item já escolhido");
                    } else {
                        precoFabrica += precoItem[2];
                        opcional[2] = true;
                    }
                    break;
                case 'd':
                    if (opcional[3]) {
                        System.out.println("Item já escolhido");
                    } else {
                        precoFabrica += precoItem[3];
                        opcional[3] = true;
                    }
                    break;
                case 'e':
                    if (opcional[4]) {
                        System.out.println("Item já escolhido");
                    } else {
                        precoFabrica += precoItem[4];
                        opcional[4] = true;
                    }
                    break;
                case 'f':
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcaoMenu != 'f');

        precoFinal = precoFabrica * 1.03;
        System.out.println("Preço final: " + precoFinal);
        System.out.println("Itens inclusos:");
        for (int i = 0; i < opcional.length; i++) {
            if (opcional[i] == true) {
                System.out.println(nomeItem[i]);
            }
        }

        teclado.close();
    }
}
