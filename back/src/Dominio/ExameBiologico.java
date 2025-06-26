package Dominio;

public class ExameBiologico {
    protected double hemoglobina;
    protected double ferretina;
    protected double vitaminaA;
    protected double vitaminaD;
    protected double zinco;

    public ExameBiologico(double hemoglobina, double ferretina, double vitaminaA, double vitaminaD, double zinco) {
        this.hemoglobina = hemoglobina;
        this.ferretina = ferretina;
        this.vitaminaA = vitaminaA;
        this.vitaminaD = vitaminaD;
        this.zinco = zinco;
    }

    public double getHemoglobina() {
        return hemoglobina;
    }

    public double getFerretina() {
        return ferretina;
    }

    public double getVitaminaA() {
        return vitaminaA;
    }

    public double getVitaminaD() {
        return vitaminaD;
    }

    public double getZinco() {
        return zinco;
    }
    public String resultado (){
        return "Resultado do Exame Biologico";
    }
    public void compararValores(){

    }
    public String sugerirSuplementacao(){
        return "sugerirSuplementacao";
    }
}
