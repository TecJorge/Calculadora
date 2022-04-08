public class Produto {

    private double multiplicador;
    private double multiplicando;


    private static final int MULTIPLICADOR_POR_OMISSAO = 0;
    private static final int MULTIPLICANDO_POR_OMISSAO = 0;


    public Produto(double multiplicador, double multiplicando) {
        this.multiplicador = multiplicador;
        this.multiplicando = multiplicando;

    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public double getMultiplicando() {
        return multiplicando;
    }


    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;
    }



    public String toString() {
        return String.format("Multiplicador = %.2f e Multiplicando = %.2f",
                multiplicando, multiplicador);
    }

    public double Produto() {
        return multiplicador*multiplicando;
    }
}
