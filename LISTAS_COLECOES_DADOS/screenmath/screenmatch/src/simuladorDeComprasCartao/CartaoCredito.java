package simuladorDeComprasCartao;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double saldo;
    private double limite;
    private List<Compra> compras;

    //inicializando o limite do usuário
    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;//saldo inicial do usuário será exatamente do limite digitado
        this.compras = new ArrayList<>();//inicializando o array de lista das compras
    }

    public boolean lancaCompra(Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    //inicialmente o usuário não pode modificar os valores de limite, saldo e compras, então
    //vamos fazer somente os getters dos atributos

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
