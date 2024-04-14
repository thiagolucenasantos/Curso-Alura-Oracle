package exerciciosModificadoresAcesso;

public class idadePessoaPrincipal {
    public static void main(String[] args) {
        IdadePessoa idadePessoa1 = new IdadePessoa();
        idadePessoa1.setNome("Thiago");
        idadePessoa1.setIdade(20);

        IdadePessoa idadePessoa2 = new IdadePessoa();
        idadePessoa2.setNome("Catarina");
        idadePessoa2.setIdade(17);

        System.out.println(idadePessoa1.getNome() + " tem " + idadePessoa1.getIdade() );
        idadePessoa1.verificarIdade();

        System.out.println(idadePessoa2.getNome() + " tem " + idadePessoa2.getIdade() );
        idadePessoa2.verificarIdade();
    }
}
