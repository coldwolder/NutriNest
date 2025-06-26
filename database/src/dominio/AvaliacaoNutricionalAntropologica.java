package dominio;
import javax.xml.crypto.Data;
public class AvaliacaoNutricionalAntropologica {
    protected Data dataAvaliacao;
    protected double peso;
    protected double estatura;
    protected double perimetroCefalico;
    protected double perimetroToracico;
    protected double perimetroBraquial;
    protected double perimetroAbdominal;

    AvaliacaoNutricionalAntropologica(Data dataAvaliacao, double peso, double estatura, double perimetroCefalico, double perimetroToracico, double perimetroBraquial, double perimetroAbdominal) {
        this.dataAvaliacao = dataAvaliacao;
        this.peso = peso;
        this.estatura = estatura;
        this.perimetroCefalico = perimetroCefalico;
        this.perimetroToracico = perimetroToracico;
        this.perimetroBraquial = perimetroBraquial;
        this.perimetroAbdominal = perimetroAbdominal;
    }

    public Data getDataAvaliacao() {
        return dataAvaliacao;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPerimetroCefalico() {
        return perimetroCefalico;
    }

    public double getPerimetroToracico() {
        return perimetroToracico;
    }

    public double getPerimetroBraquial() {
        return perimetroBraquial;
    }

    public double getPerimetroAbdominal() {
        return perimetroAbdominal;
    }


    public double CalculodeGomez(){
        return 0;
    }
    public double CalculoDeWartelow(){
        return 0;
    }
    public void consultaTabelaEscoreZ(){
        System.out.println("consultanto tabela Z");
    }
    public String gerarDiagnostico(){
        return "resultado do Diagnostico";
    }
}