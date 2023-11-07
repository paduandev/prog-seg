package exercicio;

public class MaquinaCafe {
    public final int MAX_AGUA = 950;
    public final int AGUA_PEQUENO = 50;
    public final int AGUA_MEDIO = 80;
    public final int AGUA_GRANDE = 100;
    private int reservatorioCapsulas;
    private int agua;

    public MaquinaCafe() {
    }

    public MaquinaCafe(int agua) {
        this.agua = agua;
    }

    public int getAgua() {
        return agua;
    }

    public int getReservatorioCapsulas() {
        return reservatorioCapsulas;
    }

    public void abastecerAgua(int agua) {
        if (agua > 0) {
            if (this.agua + agua > MAX_AGUA) {
                this.agua = MAX_AGUA;
            } else {
                this.agua += agua;
            }
        }
    }

    public void esvaziarReservatorio() {
        reservatorioCapsulas = 0;
    }

    public void fazerCafePequeno() throws Exception {
        if (reservatorioCapsulas == 4) {
            throw new Exception("Reservatório de cápsulas cheio");
        }
        if (agua < AGUA_PEQUENO) {
            throw new Exception("Água insificiente");
        }

        agua -= AGUA_PEQUENO;
        reservatorioCapsulas++;
    }

    public void fazerCafeMedio() throws Exception {
        if (reservatorioCapsulas == 4) {
            throw new Exception("Reservatório de cápsulas cheio");
        }
        if (agua < AGUA_MEDIO) {
            throw new Exception("Água insificiente");
        }

        agua -= AGUA_MEDIO;
        reservatorioCapsulas++;
    }

    public void fazerCafeGrande() throws Exception {
        if (reservatorioCapsulas == 4) {
            throw new Exception("Reservatório de cápsulas cheio");
        }
        if (agua < AGUA_GRANDE) {
            throw new Exception("Água insificiente");
        }

        agua -= AGUA_GRANDE;
        reservatorioCapsulas++;

    }

}
