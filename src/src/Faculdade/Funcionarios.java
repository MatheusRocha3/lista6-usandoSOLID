package Faculdade;

public abstract class Funcionarios implements ReajjusteSalario {

    private  String nome;
    private String cpf;
    private  String numeroDoRegistro;
    private  String orgaoDeLotacao;
    double salario = 0;

    public Funcionarios(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario) {
        this.nome = (nome);
        this.cpf = (cpf);
        this.numeroDoRegistro = (numeroDoRegistro);
        this.orgaoDeLotacao = (orgaoDeLotacao);
        this.salario = (salario);
    }



    public void apresentar(){
        System.out.println("O nome do funcionário é: " + this.getNome());
        System.out.println("O CPF do funcionário é: : " + this.getCpf());
        System.out.println("O número do registro do funcionário é: " + this.getNumeroDoRegistro());
        System.out.println("O orgão de lotação do funcionário é: " + this.getOrgaoDeLotacao());
        System.out.println(" O salário do funcionário é: R$" + this.getSalario());
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNumeroDoRegistro() {
        return numeroDoRegistro;
    }
    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }
    public double getSalario() {
        return salario;
    }

}