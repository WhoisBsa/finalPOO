
package interfacesbibilioteca;

import Classes.Artigo;
import Classes.Editora;
import Classes.Livro;
import Classes.Revista;

public class InterfacesBibilioteca {

    public static void main(String[] args) {
        
        Editora edCafu = new Editora("Cafú", "Campos Elísios");
        Editora edGimba = new Editora("Gimba", "Pirapoaarara");
        
        Livro livro = new Livro("Negrinho do pastoreio", 120, edCafu, "1992");
        livro.emprestar("12/05/2019");
        System.out.println("###################################");
        livro.getDados();
        
        Artigo artigo = new Artigo("Porque você boceja quando alguém boceja?", 12, "12/12/12", "Conferência de São Vicente de Paula");
        System.out.println("###################################");
        artigo.getDados();
        
        Revista revista = new Revista("Playboy", 1, "Nu artístico", "Dezembro", "1976", edGimba);
        revista.emprestar("25/12/3000");
        System.out.println("###################################");
        revista.getDados();
        
        
        
        
        
    }
    
}
