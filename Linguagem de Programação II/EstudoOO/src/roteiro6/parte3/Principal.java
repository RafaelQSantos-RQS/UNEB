package roteiro6.parte3;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Declaração de variáveis
        Tempo horaInicial = new Tempo(10,15,2);
        Ligacao lig01 = new Ligacao("11223344","55667788","A","B",horaInicial);

        // Duração
        JOptionPane.showMessageDialog(null
                ,"A duração foi de " + lig01.getDuracao().getHora() + ":" + lig01.getDuracao().getMinuto() + ":" + lig01.getDuracao().getSegundo()
                ,"Duração da chamada (Sem valor de fim)",
                JOptionPane.INFORMATION_MESSAGE);
        String [] arrHorario = JOptionPane.showInputDialog("Defina um horário de término").split(":",3);
        List<Integer> integers = Arrays.stream(arrHorario).map(Integer::parseInt).toList();
        lig01.setHorarioFim(new Tempo(integers.get(0),integers.get(1),integers.get(2)));
        JOptionPane.showMessageDialog(null
                ,"A duração foi de " + lig01.getDuracao().getHora() + ":" + lig01.getDuracao().getMinuto() + ":" + lig01.getDuracao().getSegundo()
                ,"Chamada com valor de fim"
                ,JOptionPane.INFORMATION_MESSAGE);

        // Custo
        String msg = "O custo da ligação foi de: R$ " + lig01.getcustoDaChamada();
        JOptionPane.showMessageDialog(null,msg);
    }
}
