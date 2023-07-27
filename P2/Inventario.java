import java.util.ArrayList;
import java.util.Collections;
public class Inventario {
    private String nome;
    private ArrayList<Cliente> clientes;
    public Inventario(String nome){
        setNome(nome);
        clientes = new ArrayList<Cliente>();
    }
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void removerCliente(Cliente cliente){
        clientes.remove(cliente);
    }
    public void imprimirClientes(){
        Collections.sort(clientes);
        for (Cliente cliente: clientes) {
            System.out.println(cliente);
        }
    }

    // Setters e getters

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty())
            return false;
        this.nome = nome;
        return true;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
