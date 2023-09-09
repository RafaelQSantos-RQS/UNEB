package roteiro5.parte2;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        // Declaração de variaveis
        String nomeFantasia;
        String razaoSocial;
        String cnpj;

        // Criação da loja 1 (Padrão completo 3 parametros)
        nomeFantasia = JOptionPane.showInputDialog("Insira o nome fantasia:");
        razaoSocial = JOptionPane.showInputDialog("Insira o nome Razão Social:");
        cnpj = JOptionPane.showInputDialog("Insira o nome CNPJ:");
        Loja loja1 = new Loja(nomeFantasia,razaoSocial,cnpj);

        // Mostrando a resposta
        String msg1 = "Nome Fantasia: " + loja1.getNomeFantasia() + "\nRazão Social: " + loja1.getRazaoSocial() + "\nCNPJ: " + loja1.getCnpj();
        JOptionPane.showMessageDialog(null,msg1);

        // Criação da loja 2 (Padrão 2, com 2 parametros)
        nomeFantasia = JOptionPane.showInputDialog("Insira o nome fantasia:");
        razaoSocial = JOptionPane.showInputDialog("Insira o nome Razão Social:");
        cnpj = JOptionPane.showInputDialog("Insira o nome CNPJ:");
        Loja loja2 = new Loja(nomeFantasia,cnpj);

        // Mostrando a resposta
        String msg2 = "Nome Fantasia: " + loja2.getNomeFantasia() + "\nRazão Social: " + loja2.getRazaoSocial() + "\nCNPJ: " + loja2.getCnpj();
        JOptionPane.showMessageDialog(null,msg2);
    }
}
