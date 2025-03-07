package Entidades;

public class Aluguel {
    private double custoAluguel;
    private double custoManutenção;
    private int numeroAluguel;
    private static int autoIncremento = 1;

    public Aluguel(double custoAluguel, double custoManutenção){
        this.custoAluguel = custoAluguel;
        this.custoManutenção = custoManutenção;
        this.numeroAluguel = autoIncremento++;
    }

    public void setCustoAluguel(double novocustoAluguel) {
        this.custoAluguel = novocustoAluguel;
    }

    public double getCustoAluguel() {
        return this.custoAluguel;
    }

    public void setCustoManutenção(double novocustoManutenção) {
        this.custoManutenção = novocustoManutenção;
    }

    public double getCustoManutenção() {
        return custoManutenção;
    }

    public void setNumeroAluguel(int numeroAluguel) {
        this.numeroAluguel = numeroAluguel;
    }

    public int getNumeroAluguel() {
        return this.numeroAluguel;
    }

    @Override
    public String toString() {
        return "Cliente{Custo de aluguel=" + getCustoAluguel() + ", Custo de manutenção=" + getCustoManutenção() + ", Numero do aluguel: " + getNumeroAluguel() + "}";
    }
}
