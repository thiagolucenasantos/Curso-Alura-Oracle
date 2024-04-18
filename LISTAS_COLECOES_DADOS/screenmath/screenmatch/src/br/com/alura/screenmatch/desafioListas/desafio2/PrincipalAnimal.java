package br.com.alura.screenmatch.desafioListas.desafio2;

public class PrincipalAnimal {
    public static void main(String[] args) {

       Animal animal = new Cachorro();

       if (animal instanceof Cachorro){
           Cachorro cachorro = (Cachorro) animal;
       }
    }
}
