package funcoes;

import java.util.ArrayList;
import objetos.Cliente;

public class MetodosCliente implements Metodos<Cliente>{
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    @Override
    public void gravar(Cliente cliente) throws Exception{

        if(cliente.getNome().isBlank() || cliente.getEndereco().isBlank() || cliente.getTelefone().isBlank() || cliente.getCPF().isBlank() ){
            throw new Exception("Você não preencheu todas as informações!");
        }

        cliente.setNumCadastro(clientes.size() + 1);
        clientes.add(cliente);
    }

    @Override
    public void excluir(int id) throws Exception{

        boolean encontrado = false;
        if(id <= 0){
            throw new Exception("Este número não pôde ser encontrado!");
        }

        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getNumCadastro() == id){
                encontrado = true;
                clientes.remove(i);
                break;
            }
        }

        if(!encontrado) throw new Exception("Cliente não encontrado!");
    }

    @Override
    public void editar(Cliente cliente) throws Exception{
        
        final int id = cliente.getNumCadastro();
        boolean encontrado = false;

        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getNumCadastro() == id){
                clientes.get(i).setCPF(cliente.getCPF());
                clientes.get(i).setEndereco(cliente.getEndereco());
                clientes.get(i).setNome(cliente.getNome());
                clientes.get(i).setTelefone(cliente.getTelefone());

                encontrado = true;
                break;
            }
        }
        
        if(!encontrado) throw new Exception("Cliente não encontrado!");

    }

}
