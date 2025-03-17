package Repositorio;

import java.util.ArrayList;
import Entidades.Cliente;

public class ClienteRepositorio {
    private ArrayList<Cliente> listaCliente;
    
    public ClienteRepositorio(ArrayList<Cliente> clientes){
        this.listaCliente = clientes;
    }

    public void salvar(Cliente cliente){
        this.listaCliente.add(cliente);
    }

    public boolean remover(Cliente cliente){
        return listaCliente.remove(cliente);
    }

    public ArrayList<Cliente> listarCliente(){
        return listaCliente;
    }

    public void alteraNome(Cliente cliente){
        for(Cliente clientes: listaCliente){
            if(clientes.getNomeCompleto().equals(cliente.getNomeCompleto())){
                clientes.setNomeCompleto(cliente.getNomeCompleto());
                break;
            }
        }
    }
}

