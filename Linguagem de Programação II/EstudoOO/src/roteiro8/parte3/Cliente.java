package roteiro8.parte3;

import java.util.ArrayList;

public class Cliente {
    private String cpf_cnpj;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private ArrayList<Veiculo> veiculo;

    public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone, Veiculo veiculo) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
        listaDeVeiculos.add(veiculo);
        this.veiculo = listaDeVeiculos;
    }
    public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = new ArrayList<>();
    }
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }
    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void addVeiculo(Veiculo veiculo) {
        this.veiculo.add(veiculo);
    }
    public ArrayList<Veiculo> getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(ArrayList<Veiculo> arrVeiculos) {
        for(Veiculo veiculo: arrVeiculos) this.addVeiculo(veiculo);
    }
    public int getQtdVeiculos() {
        return this.veiculo.size();
    }
}
