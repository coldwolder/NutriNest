package dominio;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class Crianca {
    private String nome;
    private Date dataNascimento;
    private boolean prematuro;
    private double pesoNascimento;
    private double comprimentoNascimento;
    private String responsavelID;
    private List<AvaliacaoComorbidade> comorbidades = new ArrayList();
    private List<AvaliacaoNutricionalAntropologica> avaliacoesNutricionais = new ArrayList();
    private List<ExameBiologico> examesBiologicos = new ArrayList();

    public Crianca(String nome, Date dataNascimento, boolean prematuro, double pesoNascimento, double comprimentoNascimento, String responsavelID) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.prematuro = prematuro;
        this.pesoNascimento = pesoNascimento;
        this.comprimentoNascimento = comprimentoNascimento;
        this.responsavelID = responsavelID;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public boolean isPrematuro() {
        return this.prematuro;
    }

    public double getPesoNascimento() {
        return this.pesoNascimento;
    }

    public double getComprimentoNascimento() {
        return this.comprimentoNascimento;
    }

    public String getResponsavelID() {
        return this.responsavelID;
    }

    public int getIdadeEmAnos() {
        LocalDate nascimento = this.dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate hoje = LocalDate.now();
        return Period.between(nascimento, hoje).getYears();
    }

    public void adicionarComorbidade(AvaliacaoComorbidade a) {
        this.comorbidades.add(a);
    }

    public void adicionarAvaliacaoNutricional(AvaliacaoNutricionalAntropologica a) {
        this.avaliacoesNutricionais.add(a);
    }

    public void adicionarExameBiologico(ExameBiologico e) {
        this.examesBiologicos.add(e);
    }

    public List<AvaliacaoComorbidade> getComorbidades() {
        return this.comorbidades;
    }

    public List<AvaliacaoNutricionalAntropologica> getAvaliacoesNutricionais() {
        return this.avaliacoesNutricionais;
    }

    public List<ExameBiologico> getExamesBiologicos() {
        return this.examesBiologicos;
    }
}