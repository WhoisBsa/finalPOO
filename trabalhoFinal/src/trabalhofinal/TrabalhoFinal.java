
package trabalhofinal;

import models.Eletricista;
import models.Funcionario;
import models.Mecanico;
import models.Relatorio;

public class TrabalhoFinal {

    public static void main(String[] args) {
        Mecanico m = new Mecanico();
        Eletricista e = new Eletricista();
        Relatorio r = new Relatorio();
        
        r.setCodMaterial("BUNDA");
        
        System.out.println(r.getCodMaterial());
        
        e.setNome("Manoel");
        m.setNome("Joaquim");
        System.out.println(m.getNome());
        System.out.println(e.getNome());
    }
    
}
