package Entidades;

public class Aluguel {
    private double custoAluguel;
    private double custoManutenção;

    public Aluguel(double custoAluguel, double custoManutenção){
        this.custoAluguel = custoAluguel;
        this.custoManutenção = custoManutenção;
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

}
