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
    public static void main(String[] args){
        Janela janela = new Janela();

        JFrame frame = new JFrame("Java Swing - Desenvolvimento de Sistemas");

        frame.setSize(400, 255);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);

        metodos funcoes = new metodos();
        funcoes.centralizar(frame);

        JLabel jlAgencia = new JLabel();
        jlAgencia.setText("Código da Agência");
        jlAgencia.setBounds(10, 10, 110, 18);
        JTextField jtfAgencia = new JTextField(20);
        jtfAgencia.setBounds(125, 10, 50, 20);
        frame.getContentPane().add(jlAgencia);
        frame.getContentPane().add(jtfAgencia);

        JLabel jlConta = new JLabel();
        jlConta.setText("Número da Conta");
        jlConta.setBounds(205, 10, 105, 18);
        JTextField jtfConta = new JTextField(20);
        jtfConta.setBounds(315, 10, 60, 20);
        frame.getContentPane().add(jlConta);
        frame.getContentPane().add(jtfConta);

        JSeparator jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        frame.getContentPane().add(jSeparator01);

        JLabel jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField jtfNome = new JTextField(20);
        jtfNome.setBounds(75, 50, 300, 20);
        frame.getContentPane().add(jlNome);
        frame.getContentPane().add(jtfNome);

        JLabel jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField jtfEndereco = new JTextField(20);
        jtfEndereco.setBounds(75, 75, 300, 20);
        frame.getContentPane().add(jlEndereco);
        frame.getContentPane().add(jtfEndereco);

        JLabel jlTelefone = new JLabel("Telefone");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField jtfTelefone = new JTextField(20);
        jtfTelefone.setBounds(75, 100, 300, 20);
        frame.getContentPane().add(jlTelefone);
        frame.getContentPane().add(jtfTelefone);

        JLabel jlCpf = new JLabel("CPF.");
        jlCpf.setBounds(10, 125, 60, 18);
        JTextField jtfCpf = new JTextField(20);
        jtfCpf.setBounds(100, 150, 111, 20);
        frame.getContentPane().add(jlCpf);
        frame.getContentPane().add(jtfCpf);

        JRadioButton jrbCorrente = new JRadioButton("Conta Corrente");
        JRadioButton jrbPoupanca = new JRadioButton("Conta Poupança");

        ButtonGroup bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        JSeparator jSeparator02 = new JSeparator();
        frame.add(jSeparator02);

        JButton jbConsultar = new JButton("Consultar");
        JButton jbAtualizar = new JButton("Atualizar");
        JButton jbFechar = new JButton("Fechar");
        frame.add(jbConsultar);
        frame.add(jbAtualizar);
        frame.add(jbFechar);

        janela.setVisible(true);


    }
}
