package Dominio;

public class ProfissionalDaSaude extends Usuario {
    private String registroProfissional;
    private String areaDoProfissional;

    ProfissionalDaSaude(String nome, String cpf, String registroProfissional, String areaDoProfissional) {
        super(nome, cpf);
        this.registroProfissional = registroProfissional;
        this.areaDoProfissional = areaDoProfissional;
    }
    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public String getAreaDoProfissional() {
        return areaDoProfissional;
    }

}
