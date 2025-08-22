package funcoes;

import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFrame;

public class metodos {
    
    public void centralizar(JFrame janela){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamanhoJanela = janela.getSize();

        if(tamanhoJanela.height > screen.height)
            janela.setSize(tamanhoJanela.width, screen.height);
        if(tamanhoJanela.width > screen.width)
            janela.setSize(screen.width, tamanhoJanela.height);

        janela.setLocation((screen.width - tamanhoJanela.width) / 2,
                (screen.height - tamanhoJanela.height) / 2);
    }
}
