package Exercicios;

public class CarroPrincipal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Corsa";
        carro.cor = "azul";
        carro.anoCarro = 1987;

        carro.fichaTecnica();

        int idadeCarro = carro.idadeCarro(2024);
        System.out.println("Anos do carro baseado no ano atual de 2024: " + idadeCarro + " anos");
    }
}
