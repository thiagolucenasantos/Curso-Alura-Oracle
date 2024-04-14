package exerciciosModificadoresAcesso;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setPreco(10.00);

        System.out.println("Nome produto: " + produto.getNome());
        System.out.println("Preço normal: " + produto.getPreco());


        produto.aplicarDesconto(10);
        System.out.println("Preço produto com desconto: " + produto.getPreco());
    }
}
