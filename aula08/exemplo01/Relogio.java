package exemplo01;

public class Relogio {
    // atributos
    private int hora;
    private int minuto;
    private int segundo;

    // métodos

    // construtor
    // método especial usado na criação do objeto
    // que inicializa o objeto para uso
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // altera o valor da hora
    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            hora = novaHora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            return true;
        } else {
            return false;
        }
    }

    // obtem o valor da hora
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String exibir() {
        return hora + ":" + minuto + ":" + segundo;
    }
}