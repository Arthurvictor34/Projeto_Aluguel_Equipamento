package Serviço;

import Entidades.Equipamento;
import Repositorio.EquipamentoRepositorio;

public class EquipamentoServico {
    private EquipamentoRepositorio equipamentoRepositorio;

    public EquipamentoServico(EquipamentoRepositorio equipamentoRepositorio){
        this.equipamentoRepositorio = equipamentoRepositorio;
    }

    public void cadastra(Equipamento equipamento){
        equipamentoRepositorio.salvar(equipamento);
    }

    public void excluir(Equipamento equipamento){
        equipamentoRepositorio.remover(equipamento);
    }

    public void listar(){
        equipamentoRepositorio.listarEquipamento().forEach(System.out::println);
    }
}
