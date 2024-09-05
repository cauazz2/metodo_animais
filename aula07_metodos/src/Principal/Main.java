package Principal;

import Entidade.Animal;
import Entidade.Cachorro;
import Entidade.Gato;

public class Main{
    
    public static void main(String[] args) {
        
        
    Animal cachorro = new Cachorro();
    Animal gato = new Gato();

    System.out.println(gato.EmitirSom());
    System.out.println(cachorro.EmitirSom());
    
        
    }

}
