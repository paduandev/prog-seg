package exemplo02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("Digite um valor inteiro:");
            numero = Integer.parseInt(entrada.nextLine());
            System.out.println("Você digitou: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida");
        } catch (NumberFormatException e) {
            System.out.println("Erro na conversão dos dados");
        } catch (Exception e) {
            System.out.println("Erro.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Final da execução");
            entrada.close();
        }

        
    }
}
