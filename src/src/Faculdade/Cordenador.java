package Faculdade;
import java.util.*;
public class Cordenador extends  Funcionarios {
    private final List<Professor> listaprofessoresSupervisionados = new ArrayList<>();

    public Cordenador(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);
    }




    @Override
    public void apresentar() {
        System.out.println("Lista de coordenadores: ");
        System.out.println("O nome do coordenador é: " + this.getNome());
        System.out.println("Lista de professores supervisionados: ");
        for (Professor profesor : listaprofessoresSupervisionados) {
            System.out.println("Professor: " + profesor.getNome());
        }
    }

    public void adicionarProfessor(Professor professoresSupervisionados) {
        if (listaprofessoresSupervisionados.size() > 10) {
            System.out.println("O número máximo de professores é 10");
        } else {
            this.listaprofessoresSupervisionados.add(professoresSupervisionados);
        }
    }


    @Override
    public void reembolsoDeDespesas() {

    }


    @Override
    public void aumentoSalario() {
        System.out.println();
        double aumento = this.getSalario() * 5 /100;
        System.out.println("O aumento feito em seu salário foi de 10% : R$ " + aumento);
    }
}

