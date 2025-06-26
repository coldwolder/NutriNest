package Dominio;

public class Usuario {
    protected String nome;
    protected String cpf;

    Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void cadastraUsuario(){
        System.out.println("Digite seu nome:" + nome );
        System.out.println("Digite seu cpf:" + cpf);
        System.out.println("Usuario cadastrado com sucesso!");
    }
}
