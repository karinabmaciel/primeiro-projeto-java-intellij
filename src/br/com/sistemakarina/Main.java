package br.com.sistemakarina;

import br.com.sistemakarina.model.Gato;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Karina");
        System.out.println("Professor Wagner");
        int numero1 = 10;
        int numero2 = 5;

        System.out.println("a soma igual = " + (numero1 + numero2));

        Gato gato = new Gato("tico", "amarelo", 3);
        System.out.println("Meu Gato é =" + gato);

        gato.mia();
        System.out.println(gato.falaNome());

        Gato gato2 = new Gato("fofi", "preto", 4);
        System.out.println("Eu sou =" + gato2);

        gato2.corre();

    }
}
