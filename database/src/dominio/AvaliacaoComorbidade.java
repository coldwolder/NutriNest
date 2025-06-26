package dominio;
public class AvaliacaoComorbidade {
    private String doenca;
    private String grau;
    private String sintomas;

    public AvaliacaoComorbidade(String doenca, String grau, String sintomas) {
        this.doenca = doenca;
        this.grau = grau;
        this.sintomas = sintomas;
    }

    public String getDoenca() {
        return doenca;
    }

    public String getGrau() {
        return grau;
    }

    public String getSintomas() {
        return sintomas;
    }

    @Override
    public String toString() {
        return "Doença: " + doenca + ", Grau: " + grau + ", Sintomas: " + sintomas;
    }
}
