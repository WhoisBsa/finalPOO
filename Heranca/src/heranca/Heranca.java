
package heranca;

import Classes.Animal;
import Classes.Cachorro;
import Classes.Gato;


/*
## MODIFICADORES DE ACESSO: ##
public - visível por todos;
private - somente na própria classe;
protected - subclasses possuem acesso;

ACESSO ATRIBUTOS E MÉTODOS SUPERCLASSE
Para criar um construtor e acessar os atributos de uma superclasse, é necessário
usar uma destas formas:

1 - Utilizar os get's e set's da superclasse; Cachorro

2 - usar o super(Tipo parâmetro); Gato

3 - tornar os atributos da superclasse protected; Cachorro


## POLIMORFISMO ##

Um método pode ser interpretado de forma diferente por classes
diferentes, podendo ter o seu comportamento alterado.
    Método movimentar de Animal e Cachorro

    Classes Quadrado e Círculo tem o mesmo método desenhar(),
    porém cada uma irá se comportar de forma diferente,
    desenhando a forma geométrica que representa;

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
