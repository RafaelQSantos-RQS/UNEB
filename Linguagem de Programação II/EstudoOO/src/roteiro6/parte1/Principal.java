package roteiro6.parte1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Ligacao lig01 = new Ligacao("11223344","55667788","A","B","10:15:02");
        // Questão 5
        JOptionPane.showMessageDialog(null,"Com o que foi implementado até o momento, seria possível encessar esta ligação do item 4 com o horário de 10:20:35?","Questão 5",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Sim, podemos encerrar, já que temos o método de set do horario de fim e o construtor define o horário de inicio,\ncontudo ainda não temos metodos para verificar se é um horario válido ou calcular a duração.","Questão 5 (Resposta)",JOptionPane.QUESTION_MESSAGE);

        // Questão 6
        JOptionPane.showMessageDialog(null,"Com o horário encerrado, ou seja, com os horários de início e término preenchidos,\nteríamos como calcular o tempo de duração desta ligação?\nSim ou Não?\nComo?","Questão 6",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Sim, é possível fazer a implementação de cálculo do tempo de duração, tentarei fazer criando uma função de cálculo e retornando uma string","Respota Questão 6",JOptionPane.INFORMATION_MESSAGE);

        // Duração
        JOptionPane.showMessageDialog(null,lig01.duracaoDaChamada(),"Duração da chamada (Sem valor de fim)",JOptionPane.INFORMATION_MESSAGE);
        lig01.setHorarioFim(JOptionPane.showInputDialog("Qual o horário de término da ligação?"));
        JOptionPane.showMessageDialog(null,lig01.duracaoDaChamada(),"Duração da chamada (com horário fim)",JOptionPane.INFORMATION_MESSAGE);
    }
}
