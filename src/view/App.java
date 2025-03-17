package view;

import java.util.ArrayList;

import Entidades.Cliente;
import Repositorio.ClienteRepositorio;
import Serviço.ClienteServico;

import Entidades.Equipamento;
import Serviço.EquipamentoServico;
import Repositorio.EquipamentoRepositorio;

import Entidades.Aluguel;
import Serviço.AluguelServico;
import Repositorio.AluguelRepositorio;

public class App {
    public static void main(String[] args) {
        ArrayList<Equipamento> equipamentos= new ArrayList<>();
        EquipamentoRepositorio equipamentoRepositorio = new EquipamentoRepositorio(equipamentos);
        EquipamentoServico equipamentoServico = new EquipamentoServico(equipamentoRepositorio);
        Equipamento equipamento = new Equipamento("Machado", "Manual");
        equipamentoServico.cadastra(equipamento);
        equipamentoServico.listar();

        ArrayList<Cliente> clientes = new ArrayList<>();
        ClienteRepositorio clienteRepositorio = new ClienteRepositorio(clientes);
        ClienteServico clienteServico = new ClienteServico(clienteRepositorio);
        Cliente cliente = new Cliente("Carlos Santos", 19, "123.422.154-12", "81 99857-3245", "EmailTeste@gmail.com");
        clienteServico.cadastra(cliente);
        clienteServico.listar();

        ArrayList<Aluguel> algueis = new ArrayList<>();
        AluguelRepositorio aluguelRepositorio = new AluguelRepositorio(algueis);
        AluguelServico aluguelServico = new AluguelServico(aluguelRepositorio);
        Aluguel aluguel = new Aluguel(200);
        aluguelServico.calcularManutencao(aluguel);
        aluguelServico.cadastra(aluguel);
        aluguelServico.listar();

    }
}

