package Repositorio;
import java.util.ArrayList;
import Entidades.Equipamento;

public class RepositorioEquipamento {
    ArrayList<Equipamento> listaEquipamentos = new ArrayList<>();

    public void adicionarEquipamento(Equipamento equipamento){
        listaEquipamentos.add(equipamento);
    }

    public void removerEquipamento(Equipamento equipamento){
        listaEquipamentos.remove(equipamento);
    }

    public void listaEquipamento(){  
        for(Equipamento lista: listaEquipamentos){
            System.out.println(lista);
        }
    }
}
