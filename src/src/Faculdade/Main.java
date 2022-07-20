package Faculdade;

public class Main {
    public static void main(String[] args) {
        FuncionarioAdministrativo f1 = new FuncionarioAdministrativo("Kauã Telles", "555.555.555.55", "55555", "Secretaria Geral", 5000, "Secretário geral", "Pleno");
        f1.apresentar();
        f1.reembolsoDeDespesa();
        Professor professor1 = new Professor("André Buscaratti", "666.666.666.66", "6666", "Secretaria Geral", 3000, "Mestre em Letras", "Português");
        Professor professor2 = new Professor("João da Silva", "777.777.777.77", "7777", "Secretaria Geral", 3000, "Mestre em Geografia", "Geografia");
        Cordenador coordenador1 = new Cordenador("Patricia Pereira", "888.888.888.88", "8888", "Secretaria Geral", 4000);
        coordenador1.reembolsoDeDespesa();
        coordenador1.adicionarProfessor(professor1);
        coordenador1.adicionarProfessor(professor2);
        Turma turma1 = new Turma("Sétimo 5", 10);
        Turma turma2 = new Turma("Oitavo 7", 20);
        Estagiario estagiario1 = new Estagiario("Pedro", 500);
        Estagiario estagiario2 = new Estagiario("João", 500);
        professor1.adicionarTurma(turma1);
        professor1.adicionarEstagiario(estagiario1);
        professor2.adicionarTurma(turma2);
        professor2.adicionarEstagiario(estagiario2);
        professor1.apresentar();
        professor1.reembolsoDeDespesa();
        professor2.apresentar();
        professor2.reembolsoDeDespesa();
        estagiario1.apresentar();
        estagiario1.reembolsoDeDespesa();
        estagiario2.apresentar();
        estagiario2.reembolsoDeDespesa();
    }
}