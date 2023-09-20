package roteiro8.parte3;

import javax.swing.*;


public class Principal {
    public static void main(String[] args) throws IllegalAccessException {

        // Instanciando o Cliente
        JOptionPane.showMessageDialog(null,"Vamos instanciar o cliente","Let's Go",JOptionPane.INFORMATION_MESSAGE);
        Cliente cliente = new Cliente("11111111111","Cliente","Rua teste, edf. Teste","Teste@teste.com","(71)123456789");

        // Printando
        String msg =
                "CPF/CNPJ : " + cliente.getCpf_cnpj() + "\n" +
                "Nome : " + cliente.getNome() + "\n" +
                "Endereço : " + cliente.getEndereco() + "\n" +
                "Email : " + cliente.getEmail() + "\n" +
                "Telefone : " + cliente.getTelefone() + "\n" +
                "Quantidade de veículos : " + cliente.getQtdVeiculos() + "\n" +
                "Lista de veículos : " + cliente.getVeiculo();
        JOptionPane.showMessageDialog(null,msg);

        // Inserindo um veiculo
        String[] options = {"Veículo de Carga","Veículo de passeio","Veículo Pequeno"};
        String veiculo = String.valueOf(JOptionPane.showInputDialog(null,"Seleciona qual o tipo de veiculo que inserir","Seleção de veiculo", JOptionPane.INFORMATION_MESSAGE,null,options,options[0]));
        switch (veiculo) {
            case ("Veículo de Carga") -> cliente.addVeiculo(new VeiculoCarga("1111-BA",2020,5000));
            case ("Veículo de passeio") -> cliente.addVeiculo(new VeiculoPasseio("2222-BA",2021,5));
            case ("Veículo Pequeno") -> cliente.addVeiculo(new VeiculoPequeno("3333-BA",2022,"Moto"));
        }

        // Printando
        msg =
            "CPF/CNPJ : " + cliente.getCpf_cnpj() + "\n" +
                    "Nome : " + cliente.getNome() + "\n" +
                    "Endereço : " + cliente.getEndereco() + "\n" +
                    "Email : " + cliente.getEmail() + "\n" +
                    "Telefone : " + cliente.getTelefone() + "\n" +
                    "Quantidade de veículos : " + cliente.getQtdVeiculos() + "\n" +
                    "Lista de veículos : " + cliente.getVeiculo();
        JOptionPane.showMessageDialog(null,msg);
    }
}
