package Faculdade;
import java.util.*;

public class Professor extends Funcionarios {
    private String nivelDeGraduacao;
    private String diciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;
    private final List<Turma> turma = new ArrayList<>();
    private final List<Estagiario> listaDeEstagiarios = new ArrayList<>();

    public Professor(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String diciplinaMinistrada) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);
        this.setNivelDeGraduacao(nivelDeGraduacao);
        this.setDiciplinaMinistrada(diciplinaMinistrada);
    }

    @Override
    public void aumentarSalario() {
        double reajuste = (10 * this.salario) / 100;
        this.salario += reajuste;
    }

    @Override
    public void apresentar() {
        System.out.println("Lista de professores: ");
        System.out.println("O nome do professor é: " + this.getNome());
        System.out.println("O nivel de graduação do professor é: " + this.getNivelDeGraduacao());
        System.out.println("A diciplina ministrada pelo professor é: " + this.getDiciplinaMinistrada());
        System.out.println("A quantidade de alunos que esse professor dá aula é: " + this.getQuantidadeDeAlunos());
        System.out.println("Lista de estagiários: ");
        for (Estagiario estagiario : listaDeEstagiarios) {
            System.out.println("Estagiário: " + estagiario.getNome());
        }
        aumentarSalario();
        System.out.println("O salário desse professor após o reajuste será de: " + this.getSalario() + "R$");
        for (Turma turma1 : turma) {
            System.out.println("Nome da turma: " + turma1.getNomeDaTurma());

        }
    }

    public void adicionarTurma(Turma turma) {
        this.turma.add(turma);
        this.setQuantidadeDeTurmas(this.getQuantidadeDeTurmas());
        this.setQuantidadeDeAlunos(getQuantidadeDeAlunos() + turma.getQuantidadeDeAlunos());
    }

    public void adicionarEstagiario(Estagiario estagiario) {
        if (listaDeEstagiarios.size() > 3) {
            System.out.println("O professor não pode ter mais que 2 estagiários");
        } else {
            this.listaDeEstagiarios.add(estagiario);
        }
        }

        public String getNivelDeGraduacao () {
            return nivelDeGraduacao;
        }

        public void setNivelDeGraduacao (String nivelDeGraduacao){
            this.nivelDeGraduacao = nivelDeGraduacao;
        }

        public String getDiciplinaMinistrada () {
            return diciplinaMinistrada;
        }

        public void setDiciplinaMinistrada (String diciplinaMinistrada){
            this.diciplinaMinistrada = diciplinaMinistrada;
        }

        public int getQuantidadeDeAlunos () {
            return quantidadeDeAlunos;
        }

        public void setQuantidadeDeAlunos ( int quantidadeDeAlunos){
            this.quantidadeDeAlunos = quantidadeDeAlunos;
        }

        public int getQuantidadeDeTurmas () {
            return quantidadeDeTurmas;
        }

        public void setQuantidadeDeTurmas ( int quantidadeDeTurmas){
            this.quantidadeDeTurmas = quantidadeDeTurmas;
        }
    }
