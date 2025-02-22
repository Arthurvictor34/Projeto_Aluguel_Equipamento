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

    public ArrayList<Equipamento> listaEquipamento(){
        return listaEquipamentos;
    }
}
