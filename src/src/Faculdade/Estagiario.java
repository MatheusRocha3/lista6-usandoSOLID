package Faculdade;

public class Estagiario implements Reembolso {
    private String nomeEstagiarios;
    private double bolsaEstudo;

    public Estagiario (String nome, double bolsaEstudo) {
        this.nomeEstagiarios = (nome);
        this.bolsaEstudo = (bolsaEstudo);
    }
    public void apresentar() {
        System.out.println("O nome do estagiário é: " + this.nomeEstagiarios);
    }
    public String getNome () {
        return nomeEstagiarios;
    }
    public void setNome (String nome) {
        this.nomeEstagiarios = nome;
    }
    public double getBolsaEstudo () {
        return bolsaEstudo;
    }
    public void setBolsaEstudo (double bolsaEstudo) {
        this.bolsaEstudo = bolsaEstudo;
    }

    @Override
    public void reembolsoDeDespesas() {

    }



    }
