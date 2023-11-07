package exercicio;

import java.util.Scanner;

public class AppCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        int qtdeAgua;
        MaquinaCafe maquinaCafe = new MaquinaCafe(80);

        do {
            System.out.println("Nivel de água: " + maquinaCafe.getAgua() + " ml");
            System.out.println("Cápsulas usadas: " + maquinaCafe.getReservatorioCapsulas());
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
                    maquinaCafe.abastecerAgua(qtdeAgua);
                    break;
                case 2:
                    try {
                        maquinaCafe.fazerCafePequeno();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        maquinaCafe.fazerCafeMedio();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        maquinaCafe.fazerCafeGrande();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    maquinaCafe.esvaziarReservatorio();
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
