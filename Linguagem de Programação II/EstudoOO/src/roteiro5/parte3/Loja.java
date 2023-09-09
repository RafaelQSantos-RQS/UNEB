package roteiro5.parte3;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;

    // Constructors
    Loja(String nomeFantasia, String razaoSocial,String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    Loja(String nomeFantasia,String cnpj) {
        this (nomeFantasia,nomeFantasia,cnpj);
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

    public static String compararFaturamento_static(Loja loja01, Loja loja02) { // Método estático
        if (loja01.getValorFat() > loja02.getValorFat()) {
            return loja01.getNomeFantasia();
        } else if (loja01.getValorFat() < loja02.getValorFat()) {
            return loja02.getNomeFantasia();
        } else {
            return "As lojas tem faturamento igual";
        }
    }
    public String compararFaturamento(Loja loja02) { // Método não estático
        if (this.valorFat > loja02.getValorFat()) {
            return this.nomeFantasia;
        } else if (this.valorFat < loja02.getValorFat()) {
            return loja02.getNomeFantasia();
        } else {
            return "As lojas tem faturamento igual";
        }
    }
}
