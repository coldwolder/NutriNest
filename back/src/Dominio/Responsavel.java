package Dominio;

public class Responsavel extends Usuario {
    protected double telefone;
    protected String endereco;
    protected String nomeCrianca;

    Responsavel(String nome, String cpf, double telefone, String endereco, String nomeCrianca) {
        super(nome,cpf);
        this.telefone = telefone;
        this.endereco = endereco;
        this.nomeCrianca = nomeCrianca;

    }

    public String getNomeCrianca() {
        return nomeCrianca;
    }

    public void setNomeCrianca(String nomeCrianca) {
        this.nomeCrianca = nomeCrianca;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
  public void  registraCrianca(){
      System.out.println("Nome completo da crianca: " + nomeCrianca);
      System.out.println("Crianca registrada com sucesso!");
    }
}
