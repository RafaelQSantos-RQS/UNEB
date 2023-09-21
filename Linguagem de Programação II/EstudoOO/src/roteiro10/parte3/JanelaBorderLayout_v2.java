package roteiro10.parte3;

import javax.swing.*;
import java.awt.*;

public class JanelaBorderLayout_v2 extends JFrame{

    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderLayout_v2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout V2");

        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.iniciarComponentes();
        this.pack();
        this.setVisible(true);

    }

    private void iniciarComponentes() {
        this.pnCabecalho = new JPanel();
        this.pnRodape = new JPanel();
        this.pnEsquerda = new JPanel();
        this.pnDireita = new JPanel();
        this.pnCentro = new JPanel();

        iniciarCabecalho();
        iniciarCentro();
        iniciarRodape();

        this.add(pnCabecalho, BorderLayout.PAGE_START);
        this.add(pnRodape, BorderLayout.PAGE_END);
        this.add(pnEsquerda, BorderLayout.LINE_START);
        this.add(pnDireita, BorderLayout.LINE_END);
        this.add(pnCentro, BorderLayout.CENTER);
    }

    private void iniciarCabecalho(){

        this.pnCabecalho.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.pnCabecalho.add(new JLabel("Curso"));
        this.pnCabecalho.add(new JTextField(10));

        this.pnCabecalho.add(new JLabel("Observações"));
        this.pnCabecalho.add(new JTextField(25));
    }

    private void iniciarRodape(){

        this.pnRodape.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.pnRodape.add(new JButton("Botão 04"));
        this.pnRodape.add(new JButton("Botão 05"));
    }

    private void iniciarCentro(){

        this.pnCentro.setLayout(new GridLayout(3,2));

        this.pnCentro.add(new JLabel("Matricula"));
        this.pnCentro.add(new JTextField());

        this.pnCentro.add(new JLabel("Nome"));
        this.pnCentro.add(new JTextField());

        this.pnCentro.add(new JLabel("Idade"));
        this.pnCentro.add(new JTextField());

    }

}
