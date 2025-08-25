package objetos;

public class Cliente extends Pessoa {
    
    private int numCadastro = 0;
    private Conta conta;

    public Cliente(String nome, String endereco, String telefone, String cpf){
        super(nome, endereco, telefone, cpf);
    }

    public int getNumCadastro(){
        return this.numCadastro; 
    }

    public void setNumCadastro(int numCadastro){
        this.numCadastro = numCadastro;
    }

    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
