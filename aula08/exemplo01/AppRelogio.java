package exemplo01;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio r = new Relogio(-19, 15, 70);

        // atributos privados não podem ser acessados
        // fora da classe
        // r.hora = 91;
        // r.minuto = -23;

        // inicializa com os métodos de acesso
        // r.setHora(20);
        // r.setMinuto(5);
        // r.setHora(15);

        System.out.println(r.exibir());

        System.out.println("Hora atual: " + r.getHora());
        if(r.setSegundo(588)) {
            System.out.println("trocou o segundo");

        } else {
            System.out.println("Não trocou");
        }
    }
}
