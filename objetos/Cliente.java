package objetos;

public class Cliente {
    private int numCadastro;
    private String nome;
    private String endereco;
    private String telefone;
    private String CPF;

    // Construtor padrão (sem parâmetros) - NECESSÁRIO
    public Cliente() {
        // Construtor vazio
    }

    // Construtor com parâmetros (opcional)
    public Cliente(int numCadastro, String nome, String endereco, String telefone, String CPF) {
        this.numCadastro = numCadastro;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.CPF = CPF;
    }

    // Getters e Setters
    public int getNumCadastro() { return numCadastro; }
    public void setNumCadastro(int numCadastro) { this.numCadastro = numCadastro; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    
    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }
}
