public class Potency {
    private double number;
    private double potency;

    public Potency(double number, double potency) {
        this.number = number;
        this.potency = potency;
    }

    public double getNumber() {
        return number;
    }

    public double getPotency() {
        return potency;
    }

    public void setPotency(double potency) {
        this.potency = potency;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String toString(){
        return String.format("Number: %f%nPotency: %f%n",number,potency);
    }

    public double squareRoot(){
        return Math.pow(number,potency);
    }
}
