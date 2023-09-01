package roteiro2.parte3;

import javax.swing.*;

public class Programa07 {
    public static void main(String[] args) {
        int nota = 0;
        float divisor = 0;
        float media = 0;

        while(true) {
            String strResposta = JOptionPane.showInputDialog("Digite a nota:");
            int resposta = Integer.parseInt(strResposta);
            if (resposta < 0) break;
            nota+=resposta;
            divisor+=1;
        }
        media = nota/divisor;
        JOptionPane.showMessageDialog(null,"A média das notas é:" + media);
    }
}
