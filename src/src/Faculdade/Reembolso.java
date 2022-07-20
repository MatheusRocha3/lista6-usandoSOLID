package Faculdade;

public interface Reembolso {
    default void reembolsoDeDespesa(){
        System.out.println("Fucionário elegível para receber reembolso de despesas. Reembolso efetuado com sucesso");
    }
}

