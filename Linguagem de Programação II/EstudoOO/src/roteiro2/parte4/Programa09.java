package roteiro2.parte4;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Programa09 {
    public static void main(String[] args) {
        int[] vetorNotas = new int[5];
        int cont = 0;

        while(cont < 5) {

            String strNota = JOptionPane.showInputDialog("Insira uma nota entre 0 e 10");
            int nota = Integer.parseInt(strNota);

            if(nota>=0 && nota<=10) {
                vetorNotas[cont] = nota;
                cont++;
            } else {
                JOptionPane.showMessageDialog(null,"Nota inválida!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(vetorNotas));
    }
}
