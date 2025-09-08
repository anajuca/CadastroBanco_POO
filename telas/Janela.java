package telas;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.KeyEvent;
import funcoes.MetodosCliente;
import objetos.Cliente;

public class Janela extends JFrame {

    private MetodosCliente metodosCliente;
    private JTextField jtfAgencia, jtfConta, jtfNome, jtfEndereco, jtfTelefone, jtfCpf;
    private JRadioButton jrbCorrente, jrbPoupanca;
    private JButton jbConsultar, jbAtualizar, jbGravar;

    public Janela(){

        super("Java Swing - Desenvolvimento de Sistemas");
        
        metodosCliente = new MetodosCliente();
        
        JLabel jlAgencia = new JLabel();
        jtfAgencia = new JTextField();
        JLabel jlConta = new JLabel();
        jtfConta = new JTextField();
        JSeparator jSeparator01 = new JSeparator();
        JLabel jlNome = new JLabel("Nome:");
        jtfNome = new JTextField();
        JLabel jlEndereco = new JLabel("Endereço:");
        jtfEndereco = new JTextField();
        JLabel jlTelefone = new JLabel("Telefone: ");
        jtfTelefone = new JTextField();
        JLabel jlCpf = new JLabel("CPF:");
        jtfCpf = new JTextField();
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbPoupanca = new JRadioButton("Conta Poupança");
        ButtonGroup bgContas = new ButtonGroup();
        JSeparator jSeparator02 = new JSeparator();
        jbConsultar = new JButton("Consultar");
        jbAtualizar = new JButton("Atualizar");
        JButton jbFechar = new JButton("Fechar");
        jbGravar = new JButton("Gravar");
        
        setSize(400, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);
        centralizar();
        

        jlAgencia.setText("Código da Agência");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        jtfAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtfAgencia);

        jlConta.setText("Número da Conta");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        jtfConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtfConta);

        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlNome);

        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);
        
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        jtfEndereco.setBounds(75, 75, 300, 20); 
        getContentPane().add(jtfEndereco);

        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);

        jtfTelefone.setBounds(75, 100, 300, 20);   
        getContentPane().add(jtfTelefone);

        jlCpf.setBounds(40, 125, 60, 18);
        getContentPane().add(jlCpf);

        jtfCpf.setBounds(75, 125, 300, 20);
        getContentPane().add(jtfCpf);

        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic(KeyEvent.VK_C);
        jrbCorrente.setSelected(true);
        getContentPane().add(jrbCorrente);

        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic(KeyEvent.VK_P);
        getContentPane().add(jrbPoupanca);

        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        jbGravar.setBounds(10, 190, 90, 23);
        jbGravar.setMnemonic(KeyEvent.VK_G);
        getContentPane().add(jbGravar);

        jbConsultar.setBounds(100, 190, 90, 23);
        jbConsultar.setMnemonic(KeyEvent.VK_S);
        getContentPane().add(jbConsultar);

        jbAtualizar.setBounds(190, 190, 90, 23);
        jbAtualizar.setMnemonic(KeyEvent.VK_A);
        jbAtualizar.setEnabled(false);
        getContentPane().add(jbAtualizar);

        jbFechar.setBounds(280, 190, 90, 23);
        jbFechar.setMnemonic(KeyEvent.VK_F);
        jbFechar.addActionListener(e -> System.exit(0));
        getContentPane().add(jbFechar);

        adicionarListeners();
    }

    private void adicionarListeners() {
        
        jbGravar.addActionListener(e -> gravarCliente());
        
        jbConsultar.addActionListener(e -> consultarCliente());
        
        jbAtualizar.addActionListener(e -> atualizarCliente());
    }

    private void gravarCliente() {
        try {
            Cliente cliente = criarClienteFromForm();
            metodosCliente.gravar(cliente);
            JOptionPane.showMessageDialog(this, "Cliente gravado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparFormulario();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void consultarCliente() {
        try {
    
            String numeroAgencia = jtfAgencia.getText().trim();
            String numeroConta = jtfConta.getText().trim();
            
            if (numeroAgencia.isEmpty() || numeroConta.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Digite ambos: agência e conta para consultar", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
    
            int numConta = Integer.parseInt(numeroConta);
            boolean encontrado = false;
    
            
            for (Cliente cliente : metodosCliente.clientes) {
                if (cliente.getNumCadastro() == numConta) {
                    preencherFormulario(cliente);
                    encontrado = true;
                    jbAtualizar.setEnabled(true);
                    jbGravar.setEnabled(false);
                    break;
                }
            }
    
            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Cliente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
    
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Número da conta inválido. Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarCliente() {
        try {
            Cliente cliente = criarClienteFromForm();
            metodosCliente.editar(cliente);
            JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparFormulario();
            jbAtualizar.setEnabled(false);
            jbGravar.setEnabled(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Cliente criarClienteFromForm() {
        Cliente cliente = new Cliente();
        cliente.setNome(jtfNome.getText().trim());
        cliente.setEndereco(jtfEndereco.getText().trim());
        cliente.setTelefone(jtfTelefone.getText().trim());
        cliente.setCPF(jtfCpf.getText().trim());
        
        if (!jtfConta.getText().trim().isEmpty()) {
            try {
                cliente.setNumCadastro(Integer.parseInt(jtfConta.getText().trim()));
            } catch (NumberFormatException e) {

            }
        }
        
        return cliente;
    }

    private void preencherFormulario(Cliente cliente) {
        jtfConta.setText(String.valueOf(cliente.getNumCadastro()));
        jtfNome.setText(cliente.getNome());
        jtfEndereco.setText(cliente.getEndereco());
        jtfTelefone.setText(cliente.getTelefone());
        jtfCpf.setText(cliente.getCPF());
    }

    private void limparFormulario() {
        jtfAgencia.setText("");
        jtfConta.setText("");
        jtfNome.setText("");
        jtfEndereco.setText("");
        jtfTelefone.setText("");
        jtfCpf.setText("");
        jrbCorrente.setSelected(true);
    }

    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }
        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }
        setLocation((screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
    }
   
    public static void main(String[] args){
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}