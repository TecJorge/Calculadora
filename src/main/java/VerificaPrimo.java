public class VerificaPrimo {
    private double primo;

    public VerificaPrimo(double primo) {
        this.primo = primo;
    }

    public double getPrimo() {
        return primo;
    }

    public void setPrimo(double primo) {
        this.primo = primo;
    }

    public boolean Primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
