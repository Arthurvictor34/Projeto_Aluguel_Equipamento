package Repositorio;
import java.util.ArrayList;
import Entidades.Cliente;

public class RepositorioCliente {
    private ArrayList<Cliente> listaCliente = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public void removeClienteID(int id){
        for(Cliente cliente: listaCliente){
            if(cliente.getID() == id){
               listaCliente.remove(cliente); 
            }
        }
    }
    

    public void atualizarCliente(ArrayList<Cliente> cliente){
        
    }

    public void listaClientes() {
        for (Cliente cliente : listaCliente) {
            System.out.println(cliente);
        }
    }
}

