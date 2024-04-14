package exerciciosModificadoresAcesso;

public class AlunoPrincipal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Thiago");
        aluno.setNota1(5);
        aluno.setNota2(10);


        double notaFinal = aluno.retornaMedia();
        System.out.println("Nota final " + notaFinal);
    }
}
