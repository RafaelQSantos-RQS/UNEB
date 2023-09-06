package roteiro5.parte1;

import javax.swing.*;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;

    // Constructor
    Loja() {
        this.nomeFantasia = JOptionPane.showInputDialog("Insira o nome fantasia");

        String razaoSocial = JOptionPane.showInputDialog("Insira a razão social");
        if (razaoSocial.equals("")){
            this.razaoSocial = this.nomeFantasia;
        } else {
            this.razaoSocial = razaoSocial;
        }

        this.cnpj = JOptionPane.showInputDialog("Inisira o CNPJ");
    }

    // Getter and Setter
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorFat() {
        return valorFat;
    }

    public void setValorFat(double valorFat) {
        this.valorFat = valorFat;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
}
