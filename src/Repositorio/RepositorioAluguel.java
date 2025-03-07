package Repositorio;
import java.util.ArrayList;
import Entidades.Aluguel;

public class RepositorioAluguel {
    ArrayList<Aluguel> listaAluguel = new ArrayList<>();

    public void adicionarAluguel(Aluguel aluguel){
        listaAluguel.add(aluguel);
    }

    public boolean removerAluguelNumero(int numero){
        for(Aluguel aluguel:listaAluguel){
            if(aluguel.getNumeroAluguel() == numero){
                listaAluguel.remove(aluguel);
                return true;
            }
        }

        return false;
    }

    public void listaAluguel(){
        for(Aluguel lista: listaAluguel){
            System.out.println(lista);
        }
    }
}
