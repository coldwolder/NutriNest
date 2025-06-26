package dominio;
import java.util.ArrayList;
import java.util.List;

public class Responsavel extends Usuario {
    private List<Crianca> criancas = new ArrayList();

    public Responsavel(String nome, String cpf) {
    }

    public void adicionarCrianca(Crianca crianca) {
        this.criancas.add(crianca);
    }

    public List<Crianca> getCriancas() {
        return this.criancas;
    }
}
