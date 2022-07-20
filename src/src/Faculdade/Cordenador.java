package Faculdade;
import java.util.*;
public class Cordenador extends  Funcionarios {
    private final List<Professor> listaprofessoresSupervisionados = new ArrayList<>();

    public Cordenador(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);
    }

    @Override
    public void aumentarSalario() {
        double reajuste = (5 * this.getSalario()) / 100;
        this.salario += reajuste;
    }

    @Override
    public void apresentar() {
        System.out.println("Lista de coordenadores: ");
        System.out.println("O nome do coordenador é: " + this.getNome());
        aumentarSalario();
        System.out.println("Depois do reajuste de 5% o salário desse coordenador será de: R$" + this.getSalario());
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
}