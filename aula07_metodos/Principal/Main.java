package Principal;

import Entidade.Cachorro;
import Entidade.Gato;

public class Main{
    
    public static void main(String[] args) {
        
        
    Cachorro cachorro = new Cachorro();
    Gato gato = new Gato();

    System.out.println(gato.EmitirSom());
    System.out.println(cachorro.EmitirSom());
    
        
    }

}
