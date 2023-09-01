package roteiro2.parte4;

import javax.swing.*;
import java.util.Scanner;

public class Programa08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetorNotas = new int[5];

        for(int i=0;i<5;i++) {
            String strNota = JOptionPane.showInputDialog("Informe uma nota");
            vetorNotas[i] = Integer.parseInt(strNota);
        }
        for(int i=0;i<5;i++) {
            JOptionPane.showMessageDialog(null,vetorNotas[i]);
        }
    }
}
