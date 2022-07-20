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
    public void aumentarSalario() {
        double reajuste = (10 * this.salario)/100;
        this.salario += reajuste;
    }
    @Override
    public void apresentar() {
        System.out.println("Lista de funcionários da equipe administrativa: ");
        System.out.println("O nome do funcionário admistrativo é: " + this.getNome());
        System.out.println("Tipo de função: " + this.getFuncaoAdministrativa());
        System.out.println("Senioridade: " + this.getSenioridade());
        this.aumentarSalario();
        System.out.println("Novo salário com o aumento de 10% R$" + this.getSalario());
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


}