package Faculdade;

public class Turma {
    private String nomeDaTurma;
    private int quantidadeDeAlunos;
    public Turma(String nomeDaTurma, int quantidadeDeAlunos) {
        this.setNomeDaTurma(nomeDaTurma);
        this.setQuantidadeDeAlunos(quantidadeDeAlunos);
    }
    public String getNomeDaTurma() {
        return nomeDaTurma;
    }
    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }
    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }
    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }
}