package br.com.thiago.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + ": " + " Estourando nas paradas!!");
        }else {
            System.out.println(audio.getTitulo() + ": " + " É uma boa pedida!!");
        }
    }
}
