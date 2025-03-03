package Serviço;
import Entidades.Cliente;
import java.util.ArrayList;
import Repositorio.RepositorioCliente;

public class ServicoCliente {
    private RepositorioCliente repositorio;

    public ServicoCliente(RepositorioCliente repositorio) { 
        this.repositorio = repositorio; 
    }

    public boolean validarIdade(ArrayList<Cliente> clientes) {
        for(Cliente cliente: clientes){
            if(cliente.getIdade() < 18){
                System.out.println("Idade não foi validada");
                return false;
            }
        }
        System.out.println("Idade foi validada");
        return true;
    }
    
    public boolean adicionarClienteIdade(ArrayList<Cliente> clientes) {
        boolean adicionou = false;
        for(Cliente cliente: clientes){
            if(cliente.getIdade() >= 18){  // Verifica cada cliente individualmente
                repositorio.adicionarCliente(cliente);
                adicionou = true;
            }
        }
        return adicionou;
    }
}
