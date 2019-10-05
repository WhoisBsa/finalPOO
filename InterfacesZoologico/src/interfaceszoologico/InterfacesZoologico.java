package interfaceszoologico;

import Classes.Avestruz;
import Classes.Macaco;
import Classes.Morcego;
import Classes.PicaPau;
import Classes.Preguica;
import Classes.Tigre;

public class InterfacesZoologico {

    public static void main(String[] args) {
        Tigre tigre = new Tigre(3, 1.2, 333.0, "branco", "grande pakct");
        Macaco macaco = new Macaco(2, 0.6, 20.0, "rosa", "piquininim");
        PicaPau picapau = new PicaPau(0.23, 0.1, 0.200, "Vermelho", "um tiquim");
        Avestruz avestruz = new Avestruz(1.25, 0.4, 150.0, "Amarela", "Alta");
        Morcego morcego = new Morcego(333, 0.200, "preto", "igual o pica-pau");
        Preguica preguica = new Preguica(50.0, "marrom bombom", "pequena", 5000);
        
        tigre.comer();
        tigre.dormir();
        tigre.correr();
        
        macaco.comer();
        macaco.dormir();
        macaco.correr();
        macaco.escalar();
        
        picapau.comer();
        picapau.dormir();
        picapau.bicar();
        picapau.voar();
        
        avestruz.comer();
        avestruz.dormir();
        avestruz.correr();
        avestruz.bicar();
        
        morcego.comer();
        morcego.dormir();
        morcego.voar();
        morcego.empoleirar();
        
        preguica.comer();
        preguica.dormir();
        preguica.escalar();
        
    }
    
}
