package view;

import java.util.ArrayList;
import Entidades.Cliente;
import Repositorio.RepositorioCliente;
import Serviço.ServicoCliente;
import Entidades.Equipamento;
import Serviço.ServicoEquipamento;
import Repositorio.RepositorioEquipamento;
import Entidades.Aluguel;
import Serviço.ServicoAluguel;
import Repositorio.RepositorioAluguel;

public class App {
    public static void main(String[] args) {
        RepositorioCliente repositorio = new RepositorioCliente();
        ServicoCliente servico = new ServicoCliente(repositorio);
        ArrayList<Cliente> cliente = new ArrayList<>();

        RepositorioEquipamento repositorioEqui = new RepositorioEquipamento();
        ServicoEquipamento servicoEqui = new ServicoEquipamento(repositorioEqui);
        ArrayList<Equipamento> equipamentos = new ArrayList<>();

        RepositorioAluguel repositorioAluguel = new RepositorioAluguel();
        ServicoAluguel servicoAluguel = new ServicoAluguel(repositorioAluguel);
        ArrayList<Aluguel> aluguel = new ArrayList<>();
        
        cliente.add(new Cliente("Luan Santana", 19, "null", "null", "null"));
        cliente.add(new Cliente("Roberto", 21, "null", "null", "null"));
        cliente.add(new Cliente("Lucas", 20, "null", "null", "null"));
        cliente.add(new Cliente("Luana", 22, "null", "null", "null"));
        servico.validarIdade(cliente);
        servico.adicionarClienteIdade(cliente);
        servico.removerCliente(3);
        repositorio.listaClientes();

        System.out.println("");

        equipamentos.add(new Equipamento("Picareta", "Manual"));
        equipamentos.add(new Equipamento("Machado", "Manual"));
        equipamentos.add(new Equipamento("Enxada", "Manual"));
        servicoEqui.validaEquipamentoID(equipamentos);
        servicoEqui.adicionarEquipamentgo(equipamentos);
        repositorioEqui.listaEquipamento();

        System.out.println("");

        aluguel.add(new Aluguel(100, 32));
        aluguel.add(new Aluguel(120, 22));
        aluguel.add(new Aluguel(89, 30));
        servicoAluguel.validarAluguel(aluguel);
        servicoAluguel.adicionarAluguel(aluguel);
        repositorioAluguel.listaAluguel();

    }
}

