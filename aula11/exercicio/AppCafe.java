package exercicio;

import java.util.Scanner;

public class AppCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        int qtdeCapsulas;
        int qtdeAgua;
        MaquinaCafe maquinaCafe = new MaquinaCafe();

        do{
            System.out.println("1. abastercer cápsula");
            System.out.println("2. abastercer agua");
            System.out.println("3. fazer café pequeno");
            System.out.println("4. fazer café médio");
            System.out.println("5. fazer café grande");
            System.out.println("6. deligar");
            System.out.print("Opção: ");
            option = input.nextInt();
        
            switch (option) {
                case 1:
                    System.out.println("Quantas capsulas?");
                    qtdeCapsulas = input.nextInt();

                    break;
                case 2:
                    System.out.println("Quantidade água(ml)?");
                    qtdeAgua = input.nextInt();
                    
                    break;
                case 3:
                    maquinaCafe.fazerCafePequeno();
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while(option != 6);

        System.out.println("Deligando...");
        
        input.close();
    }
}
