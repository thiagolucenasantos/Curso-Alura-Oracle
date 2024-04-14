package exerciciosModificadoresAcesso;

public class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(double percentual){
        double valorDesconto = preco * (percentual / 100);
        preco -= valorDesconto;
        System.out.println("Valor do desconto R$: " + valorDesconto);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
