package roteiro10.parte1;

import javax.swing.*;

public class Janela02 extends JFrame{
    private int largura = 300;
    private int altura = 300;
    private JButton btn01;
    private JButton btn02;

    public Janela02(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setando para que quando apertasse o botãos de fechar pare o código
        this.setSize(largura,altura); // Definindo as dimensões
        this.setLocationRelativeTo(null); // Centralizando na tela
        this.setTitle("Janela 02"); // Setando o titulo da janela
        this.setLayout(null); // Configurando para que o layout dos botões fique sobre minha diração

        // Botões
        btn01 = new JButton("Botão 1");
        btn02 = new JButton("Botão 2");

        // Setando a dimensão e posição dos botões
        btn01.setBounds(20, 50, 100,40);
        btn02.setBounds(130,50,100,40);

        // Adicionando os botões a janela
        this.add(btn01);
        this.add(btn02);

        // Tornando a janela visivel
        this.setVisible(true);
    }
}
