package viewer;

import Models.Aluno;

import javax.swing.*;

public class CadastroAluno extends JFrame{
    private JPanel mainPanel;
    private JTextField JTextMatricula;
    private JTextField JTextAnoIngresso;
    private JTextField JTextCurso;
    private JTextField JTextQtd;
    private JLabel JLabelTitulo;
    private JButton OKButton;
    private JLabel JlabelMatricula;
    private JLabel JLabelNome;
    private JLabel JLabelCurso;
    private JLabel JLabelAnoIngresso;
    private JTextField JTextNome;
    private JLabel JLabelQtd;

    public CadastroAluno() {
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Lista 1 (Questão 1)");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.OKButton.addActionListener(e -> {
            int matricula = Integer.parseInt(this.JTextMatricula.getText());
            String nome = this.JTextNome.getText();
            int anoIngresso = Integer.parseInt(this.JTextAnoIngresso.getText());
            String curso = this.JTextCurso.getText();
            int qtdDeDisciplinas = Integer.parseInt(this.JTextQtd.getText());
            Aluno aluno = new Aluno(matricula,nome,anoIngresso,curso);

            aluno.setQtdDeDisciplinas(qtdDeDisciplinas);
            String msg = "Matricula: " + aluno.getMatricula() + "\n" +
                    "Nome: " + aluno.getNome() + "\n" +
                    "Ano de Ingresso: " + aluno.getAnoIngresso()  + "\n" +
                    "Curso: " + aluno.getCurso()  + "\n" +
                    "Permanência: " + aluno.getTempoPermanenciaAnos(2023)  + " anos\n" +
                    "Mensalidade: R$ " + aluno.getMensalidade() + "\n";
            JOptionPane.showMessageDialog(null,msg);

            this.JTextMatricula.setText("");
            this.JTextNome.setText("");
            this.JTextAnoIngresso.setText("");
            this.JTextCurso.setText("");
            this.JTextQtd.setText("");
        });
    }
}
