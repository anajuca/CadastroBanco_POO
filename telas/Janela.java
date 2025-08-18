package telas;
import javax.swing.JFrame;

public class Janela extends JFrame {
    public static void main(String[] args){

        JFrame frame = new JFrame("Java Swing - Desenvolvimento de Sistemas");

        frame.setSize(400, 255);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
}
