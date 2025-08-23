package telas;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

import funcoes.metodos;

public class Janela extends JFrame {

    metodos funcoes = new metodos();
    JLabel jlAgencia = new JLabel();
    JTextField jtfAgencia = new JTextField();
    JLabel jlConta = new JLabel();
    JTextField jtfConta = new JTextField();
    JSeparator jSeparator01 = new JSeparator();
    JLabel jlNome = new JLabel("Nome:");
    JTextField jtfNome = new JTextField();
    JLabel jlEndereco = new JLabel("Endereço:");
    JTextField jtfEndereco = new JTextField();
    JLabel jlTelefone = new JLabel("Telefone");
    JTextField jtfTelefone = new JTextField();
    JLabel jlCpf = new JLabel("CPF.");
    JTextField jtfCpf = new JTextField();
    JRadioButton jrbCorrente = new JRadioButton("Conta Corrente");
    JRadioButton jrbPoupanca = new JRadioButton("Conta Poupança");
    ButtonGroup bgContas = new ButtonGroup();
    JSeparator jSeparator02 = new JSeparator();
    JButton jbConsultar = new JButton("Consultar");
    JButton jbAtualizar = new JButton("Atualizar");
    JButton jbFechar = new JButton("Fechar");

    public Janela(){

        setSize(400, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);
        funcoes.centralizar(this);
        
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

        
        jlCpf.setBounds(10, 125, 60, 18);
        getContentPane().add(jlCpf);

        jtfCpf.setBounds(100, 150, 111, 20);
        getContentPane().add(jtfCpf);

        
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic('C');
        jrbCorrente.setSelected(true);
        getContentPane().add(jrbCorrente);

        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic('P');
        getContentPane().add(jrbPoupanca);

        
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic('S');
        getContentPane().add(jbConsultar);

        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic('A');
        jbAtualizar.setEnabled(false);
        getContentPane().add(jbAtualizar);

        jbFechar.setBounds(225, 190, 100, 23);
        jbFechar.setMnemonic('F');
        getContentPane().add(jbFechar);

    }
   
    public static void main(String[] args){

        Janela janela = new Janela();
        janela.setVisible(true);

    }
}
