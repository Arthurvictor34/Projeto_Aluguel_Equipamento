package Serviço;
import Entidades.Aluguel;
import Repositorio.RepositorioAluguel;
import java.util.ArrayList;

public class ServicoAluguel {
    private RepositorioAluguel repositorio;
    
    public ServicoAluguel(RepositorioAluguel repositorio){
        this.repositorio = repositorio;
    }
    public boolean validarAluguel(ArrayList<Aluguel> aluguel){
        for(Aluguel aluguels: aluguel){
            if(aluguels.getCustoAluguel() < 0){
                return false;
            }
        }
        return true;   
    }

    public boolean adicionarAluguel(ArrayList<Aluguel> aluguel){
        if(validarAluguel(aluguel)){
            for(Aluguel aluguels: aluguel){
                repositorio.adicionarAluguel(aluguels);
            }
            return true;  
        }
        return false;
    }   
}
