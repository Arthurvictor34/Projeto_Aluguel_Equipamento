package view;
import java.util.ArrayList;

import Entidades.Cliente;
import Repositorio.RepositorioCliente;
import Serviço.ServicoCliente;

public class App {
    public static void main(String[] args) {
        RepositorioCliente repositorio = new RepositorioCliente();
        ServicoCliente servico = new ServicoCliente(repositorio);
        ArrayList<Cliente> cliente = new ArrayList<>();
        
        cliente.add(new Cliente("Luan Santana", 19, "null", "null", "null"));
        cliente.add(new Cliente("Roberto", 10, "null", "null", "null"));
        cliente.add(new Cliente("Lucas", 20, "null", "null", "null"));

        servico.validarIdade(cliente);
        servico.adicionarClienteIdade(cliente);
        repositorio.listaClientes();

    }
}

