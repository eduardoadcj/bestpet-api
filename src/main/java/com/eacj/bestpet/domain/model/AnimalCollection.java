
package com.eacj.bestpet.domain.model;

import com.eacj.bestpet.util.StringListTools;
import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {

    public static List<String> animals = new ArrayList<>();
    
    static{
        
        animals = StringListTools.create(
                "Cachorro",
                "Gato",
                "Pássaro",
                "Hamster",
                "Tartaruga",
                "Coelho",
                "Peixe"
        );
        
    }
    
}
