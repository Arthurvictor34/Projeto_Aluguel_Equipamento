package Serviço;
import Entidades.Cliente;

public class ServicoCliente {
    
    public void fazerCadastro(Cliente Cliente){
        System.out.println("Cadastro de: " + Cliente.getNomeCompleto() + "Finalizado");
    }

}
