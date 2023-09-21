package roteiro10.parte1;

import javax.swing.*;

public class Janela01 extends JFrame {
    private int largura = 600;
    private int altura = 400;

    public Janela01(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura,altura);
        this.setLocationRelativeTo(null);
        this.setTitle("Janela 01");
        this.setVisible(true);
    }
}
