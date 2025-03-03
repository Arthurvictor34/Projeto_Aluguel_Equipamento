package Serviço;
import Entidades.Equipamento;
import Repositorio.RepositorioEquipamento;
import java.util.ArrayList;

public class ServicoEquipamento {
    private RepositorioEquipamento repositorio;

    public ServicoEquipamento(RepositorioEquipamento repositorio){
        this.repositorio = repositorio;
    }

    public boolean validaEquipamentoID(ArrayList<Equipamento> equipamentos){
        for(Equipamento Equipamentos: equipamentos){
            if(Equipamentos.getId() > 0){
                return true;
            }
        }
        return false;  
    }

    public boolean adicionarEquipamentgo(ArrayList<Equipamento> equipamento){
        if(validaEquipamentoID(equipamento)){
            for(Equipamento equipamentos: equipamento){
                repositorio.adicionarEquipamento(equipamentos);
            }
            return true; 
        }
        return false;
    }
}
