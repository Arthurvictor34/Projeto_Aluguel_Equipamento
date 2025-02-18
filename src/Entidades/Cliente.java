package Entidades;

public class Cliente extends Pessoa {
    private int id;
    private static int numeroID = 1;

    public Cliente(String nomeCompleto, int idade, String cpf, String celular, String email){
        super(nomeCompleto, idade, cpf, celular, email);
        this.id = numeroID;
        numeroID++;
    }

    public void setID(int novoid) {
        this.id = novoid;
    }

    public int getID() {
        return this.id;
    }

    @Override
    public String toString() { 
        return "Nome:=" + this.getNomeCompleto() + " Idade=" + this.getIdade() + " Cadastro=" + this.getID();
    }
}
