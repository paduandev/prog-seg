package exemplo01;

public class Pessoa { // extends Object
    private String nome;
    private int registro;
    
    public Pessoa(int registro, String nome) {
        this.registro = registro;
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Sobrescrita de método = mudança no comportamento em relação
    // à classe pai
    @Override
    public String toString() {
        return "Pessoa: " + registro + " : " + nome;
    }

 }