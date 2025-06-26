package dominio;

public class ProfissionalDaSaude extends Usuario implements RelatoriosGeraveis {
    private String registroProfissional;

    public ProfissionalDaSaude(String nome, String cpf, String registroProfissional) {
        super();
        this.registroProfissional = registroProfissional;
    }
    public String getRegistroProfissional() {
        return registroProfissional;
    }
    public void cadastrar() {
        System.out.println("Profissional da saúde cadastrado.");
    }
    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório gerado pelo profissional: " + getNome());
    }
}