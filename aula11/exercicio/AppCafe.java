package exercicio;

import java.util.Scanner;

public class AppCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        int qtdeAgua;
        MaquinaCafe maquinaCafe = new MaquinaCafe();

        do {
            System.out.println("1. abastercer água");
            System.out.println("2. fazer café pequeno");
            System.out.println("3. fazer café médio");
            System.out.println("4. fazer café grande");
            System.out.println("5. esvaziar reservatório cápsulas");
            System.out.println("6. desligar");
            System.out.print("Opção: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Informe a quantidade de água(ml): ");
                    qtdeAgua = input.nextInt();

                    break;
                case 2:
                    maquinaCafe.fazerCafePequeno();

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Desligando...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (option != 6);

        input.close();
    }
}
