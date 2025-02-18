package view;
import Entidades.Cliente;
import Entidades.Equipamento;
import Entidades.Aluguel;
import java.util.ArrayList;

public class App {

    public static ArrayList<Cliente> fazerCliente(){
        ArrayList<Cliente> cl = new ArrayList<>();
        cl.add(new Cliente("Arthur Victor", 19, "123.456.789-10", "81-98856-8653", "emailteste@gmail.com"));
        
        cl.add(new Cliente("João Lucas", 39, "123.456.789-10", "81-98856-8653", "emailteste@gmail.com"));
        
        cl.add(new Cliente("Neymar Junior", 32, "123.643.234-12", "00-0000-0000", "EmailTeste1@gmail.com"));

        for(Cliente clientes:cl){
            System.out.println(clientes.toString());
        }

        return cl;
    }
    public static void main(String[] args) {
       ArrayList<Cliente> cli = fazerCliente();
    }
}
