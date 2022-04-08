public class Produto {

    private double multiplicador;
    private double multiplicando;
    private double produto;

    private static final int MULTIPLICADOR_POR_OMISSAO = 0;
    private static final int MULTIPLICANDO_POR_OMISSAO = 0;
    private static final int PRODUTO_POR_OMISSAO = 0;

    public Produto(double multiplicador, double multiplicando, double produto) {
        this.multiplicador = multiplicador;
        this.multiplicando = multiplicando;
        this.produto = produto;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public double getMultiplicando() {
        return multiplicando;
    }
    public double getProduto() {
        return produto;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;
    }

    public void setProduto(double produto) {
        this.produto = produto;
    }

    public String toString() {
        return String.format("Multiplicador = %.f e Multiplicando = %.f Produto = %f",
                multiplicando, multiplicador, produto);
    }

    public double Produto() {
        return produto = multiplicador*multiplicando;
    }


}
