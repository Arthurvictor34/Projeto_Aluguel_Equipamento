package Repositorio;
import java.util.ArrayList;
import Entidades.Aluguel;

public class RepositorioAluguel {
    ArrayList<Aluguel> listaAluguel = new ArrayList<>();

    public void adicionarAluguel(Aluguel aluguel){
        listaAluguel.add(aluguel);
    }

    public void removerAluguel(Aluguel aluguel){
        listaAluguel.remove(aluguel);
    }

    public ArrayList<Aluguel> listaAluguel(){
        return listaAluguel;
    }
}
