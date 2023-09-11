package exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media, exame;
        int faltas;

        // entrada de dados
        System.out.println("Informe a nota 1:");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a nota 2:");
        nota2 = teclado.nextDouble();
        System.out.println("Informe o total de faltas:");
        faltas = teclado.nextInt();

        // processamento e saída
        if(faltas >= 16) {
            System.out.println("Aluno reprovado por falta");
        } else {
            media = (nota1 + nota2) / 2;
            if(media >= 6) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Informe a nota do exame:");
                exame = teclado.nextDouble();
                media = (media + exame) / 2;
                if(media >= 5) {
                    System.out.println("Aluno aprovado em exame");
                } else {
                    System.out.println("Aluno reprovado...");
                }
            }
        }
        teclado.close();
    }
}
