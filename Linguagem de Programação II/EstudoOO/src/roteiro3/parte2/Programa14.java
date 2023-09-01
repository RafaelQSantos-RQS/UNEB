package roteiro3.parte2;

import javax.swing.*;

public class Programa14 {
    public static void main(String[] args) {

        // Entrada de valores
        double x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de X"));
        String op = JOptionPane.showInputDialog("Informe a operação (+, -, *, /)");
        double y = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Y"));

        // Operação
        double output;
        switch (op) {
            case "+": output = soma(x,y);
                JOptionPane.showMessageDialog(null,"A resposta da operação é: " + output);
                break;
            case "-": output = subtracao(x,y);
                JOptionPane.showMessageDialog(null,"A resposta da operação é: " + output);
                break;
            case "*": output = multiplicacao(x,y);
                JOptionPane.showMessageDialog(null,"A resposta da operação é: " + output);
                break;
            case "/": output = divisao(x,y);
                JOptionPane.showMessageDialog(null,"A resposta da operação é: " + output);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Operação Inválida","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static double soma(double x, double y){
        return x+y;
    }
    public static double subtracao(double x, double y){
        return x-y;
    }
    public static double multiplicacao(double x, double y){
        return x*y;
    }
    public static double divisao(double x, double y){
        return x/y;
    }
}
