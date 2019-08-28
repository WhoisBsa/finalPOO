
package heranca;

import Classes.Animal;
import Classes.Cachorro;
import Classes.Gato;


/*
Para criar um construtor e acessar os atributos de uma superclasse, é necessário
usar uma destas formas:

1 - Utilizar os get's e set's da superclasse; Cachorro

2 - usar o super(Tipo parâmetro); Gato


*/

public class Heranca {

    public static void main(String[] args) {
        Animal besta = new Animal("Verde", 3.00, "vermelho", 2.0);
        besta.movimentar();
        System.out.println("O animal é: " + besta.getCor());
        
        Cachorro toto = new Cachorro("Azul", 2.00, "rosa", 3.0);
        toto.movimentar();
        toto.latir();
        toto.setCor("Black Piano");
        System.out.println(toto.getCor());
        
        Gato bixano = new Gato("black", 3.00, "preto", 4.0);
        bixano.movimentar();
        bixano.miar();
    }
    
}
