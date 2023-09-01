package roteiro2.parte4;

import javax.swing.*;
import java.util.Random;

public class Exercicio {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101) + 1;

        JOptionPane.showMessageDialog(null,"Bem vindo ao joguinho da advinhação!!");
        while (true) {
            String entrada = JOptionPane.showInputDialog("Qual o seu palpite?");
            int intEntrada = Integer.parseInt(entrada);
            if(intEntrada == numeroSecreto) {
                JOptionPane.showMessageDialog(null,"Parabéns, você acertou!!!");
                break;
            } else {
                if (intEntrada > numeroSecreto){
                    JOptionPane.showMessageDialog(null,"Seu palpite foi alto demais!");
                }else{
                    JOptionPane.showMessageDialog(null,"Seu palpite foi baixo demais!!");
                }
            }
        }
    }
}
