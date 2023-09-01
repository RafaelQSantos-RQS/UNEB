package roteiro4.parte4;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        // Criação de variáveis
        Aluno aluno01 = new Aluno();
        String msg;

        // Printando os usuários
        msg =
                "Matricula : " + aluno01.getMatricula() +
                "\nNome : " + aluno01.getNome() +
                "\nCurso : " + aluno01.getCurso() +
                "\nAno Ingresso : " + aluno01.getAnoIngresso() +
                "\nSituação : " + aluno01.getSituacao() +
                "\nQuantidade de matérias : " + aluno01.getQtdDisciplinas();
        JOptionPane.showMessageDialog(null, msg,"Informações sobre o aluno", JOptionPane.INFORMATION_MESSAGE);

        // Modificando a Quantidade de disciplinas
        JOptionPane.showMessageDialog(null,"Vamos alterar o valor das matérias");
        aluno01.setQtdDisciplinas(1);

        // Printando os usuários
        msg =
                "Matricula : " + aluno01.getMatricula() +
                        "\nNome : " + aluno01.getNome() +
                        "\nCurso : " + aluno01.getCurso() +
                        "\nAno Ingresso : " + aluno01.getAnoIngresso() +
                        "\nSituação : " + aluno01.getSituacao() +
                        "\nQuantidade de matérias : " + aluno01.getQtdDisciplinas();
        JOptionPane.showMessageDialog(null, msg,"Informações sobre o aluno", JOptionPane.INFORMATION_MESSAGE);

        // Alterando a última opção da quantidade de matérias
        JOptionPane.showMessageDialog(null,"Vamos alterar o valor das matérias");
        aluno01.setQtdDisciplinas(-12);

        // Printando os usuários
        msg =
                "Matricula : " + aluno01.getMatricula() +
                        "\nNome : " + aluno01.getNome() +
                        "\nCurso : " + aluno01.getCurso() +
                        "\nAno Ingresso : " + aluno01.getAnoIngresso() +
                        "\nSituação : " + aluno01.getSituacao() +
                        "\nQuantidade de matérias : " + aluno01.getQtdDisciplinas();
        JOptionPane.showMessageDialog(null, msg,"Informações sobre o aluno", JOptionPane.INFORMATION_MESSAGE);
    }
}
