package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, valorPrestacao, limitePrestacao;

        // entrada
        System.out.println("Informe o valor do salário bruto:");
        salarioBruto = teclado.nextDouble();   
        System.out.println("Informe o valor da prestação:");
        valorPrestacao = teclado.nextDouble();

        // processamento
        limitePrestacao = salarioBruto * 0.3;

        // saida
        if(valorPrestacao <= limitePrestacao) {
            System.out.println("Emprestimo aprovado");
        } else {
            System.out.println("Emprestimo recusado");
        }

        teclado.close();
    }
}
