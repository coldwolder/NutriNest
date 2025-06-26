package Dominio;

import javax.xml.crypto.Data;

public class Crianca extends Responsavel {
    protected Data datanascimento;
    protected int idade;
    protected boolean prematuro;
    protected double pesoNascimento;
    protected double centimetroNascimento;

    Crianca(Data datanascimento,int idade,boolean prematuro,double pesoNascimento,double centimetroNascimento) {
        super();
        this.datanascimento = datanascimento;
        this.idade = idade;
        this.prematuro = prematuro;
        this.pesoNascimento = pesoNascimento;
        this.centimetroNascimento = centimetroNascimento;
    }

    public Data getDatanascimento() {
        return datanascimento;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isPrematuro() {
        return prematuro;
    }

    public double getPesoNascimento() {
        return pesoNascimento;
    }

    public double getCentimetroNascimento() {
        return centimetroNascimento;
    }
    public void verificaComorbidade(){
        System.out.println();
    }
}
