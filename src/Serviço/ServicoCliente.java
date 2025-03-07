package Serviço;
import Entidades.Cliente;
import java.util.ArrayList;
import Repositorio.RepositorioCliente;
import Interface.ICliente;

public class ServicoCliente implements ICliente {
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
        return true;
    }

    public boolean removerCliente(int ID){
        return repositorio.removeClienteID(ID);
    }
    
    public boolean adicionarClienteIdade(ArrayList<Cliente> clientes) {
        boolean adicionou = false;
        for(Cliente cliente: clientes){
            if(cliente.getIdade() >= 18){
                repositorio.adicionarCliente(cliente);
                adicionou = true;
            }
        }
        return adicionou;
    }
    
    @Override
    public void gerenciaCompras(){
        
    }
}
