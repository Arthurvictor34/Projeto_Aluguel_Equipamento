package Repositorio;
import java.util.ArrayList;
import Entidades.Cliente;

public class RepositorioCliente {
    ArrayList<Cliente> listaCliente = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public void removerCliente(Cliente cliente){
        listaCliente.remove(cliente);
    }

    public ArrayList<Cliente> listaClientes(){
        return listaCliente;
    }

}
