package Serviço;

import Entidades.Cliente;
import Repositorio.ClienteRepositorio;

public class ClienteServico {
    private ClienteRepositorio clienteRepositorio;

    public ClienteServico(ClienteRepositorio clienteRepositorio){
        this.clienteRepositorio = clienteRepositorio;
    }

    public void cadastra(Cliente cliente){
        clienteRepositorio.salvar(cliente);
    }

    public void excluir(Cliente cliente){
        clienteRepositorio.remover(cliente);
    }

    public void listar(){
        clienteRepositorio.listarCliente().forEach(System.out::println);
    }
}
