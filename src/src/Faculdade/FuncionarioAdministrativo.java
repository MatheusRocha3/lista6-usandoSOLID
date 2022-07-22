package Faculdade;

public class FuncionarioAdministrativo extends Funcionarios{
    private String funcaoAdministrativa;
    private final String senioridade;
    public FuncionarioAdministrativo(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);
        this.setFuncaoAdministrativa(funcaoAdministrativa);
        this.senioridade = senioridade;
    }


    @Override
    public void apresentar() {
        System.out.println("Lista de funcionários da equipe administrativa: ");
        System.out.println("O nome do funcionário admistrativo é: " + this.getNome());
        System.out.println("Tipo de função: " + this.getFuncaoAdministrativa());
        System.out.println("Senioridade: " + this.getSenioridade());
    }
    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }
    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }
    public String getSenioridade() {
        return senioridade;
    }



    @Override
    public void reembolsoDeDespesas() {

    }


    @Override
    public void aumentoSalario() {
        System.out.println();
        double aumento = this.getSalario() * 10 /100;
        System.out.println("O aumento feito em seu salário foi de 10% : R$ " + aumento);
    }
}
