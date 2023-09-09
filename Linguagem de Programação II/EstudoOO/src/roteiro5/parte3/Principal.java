package roteiro5.parte3;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        // Declaração de variaveis
        String nomeFantasia;
        String razaoSocial;
        String cnpj;
        int valorFat;

        // Criação da loja 1 (Padrão completo 3 parametros)
        nomeFantasia = JOptionPane.showInputDialog("Insira o nome fantasia:");
        razaoSocial = JOptionPane.showInputDialog("Insira o nome Razão Social:");
        cnpj = JOptionPane.showInputDialog("Insira o nome CNPJ:");
        Loja loja1 = new Loja(nomeFantasia,razaoSocial,cnpj);
        valorFat = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do faturamento da loja " + loja1.getNomeFantasia()));
        loja1.setValorFat(valorFat);

        // Criação da loja 2 (Padrão 2, com 2 parametros)
        nomeFantasia = JOptionPane.showInputDialog("Insira o nome fantasia:");
        razaoSocial = JOptionPane.showInputDialog("Insira o nome Razão Social:");
        cnpj = JOptionPane.showInputDialog("Insira o nome CNPJ:");
        Loja loja2 = new Loja(nomeFantasia,cnpj);
        valorFat = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do faturamento da loja " + loja2.getNomeFantasia()));
        loja2.setValorFat(valorFat);

        // Mostrando a resposta (Estático)
        JOptionPane.showMessageDialog(null,"A loja de maior faturamento é: " + Loja.compararFaturamento_static(loja1,loja2));
        // Mostrando a resposta (Não estático)
        JOptionPane.showMessageDialog(null,"A loja de maior faturamento é: "+loja1.compararFaturamento(loja2));
    }
}
