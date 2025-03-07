package Repositorio;
import java.util.ArrayList;
import Entidades.Equipamento;

public class RepositorioEquipamento {
    ArrayList<Equipamento> listaEquipamentos = new ArrayList<>();

    public void adicionarEquipamento(Equipamento equipamento){
        listaEquipamentos.add(equipamento);
    }

    public boolean removerEquipamentoID(int ID){
        for(Equipamento equipamentos: listaEquipamentos){
            if(equipamentos.getId() == ID){
                listaEquipamentos.remove(equipamentos);
                return true;
            }
        }

        return false;
    }

    public void listaEquipamento(){  
        for(Equipamento lista: listaEquipamentos){
            System.out.println(lista);
        }
    }
}
