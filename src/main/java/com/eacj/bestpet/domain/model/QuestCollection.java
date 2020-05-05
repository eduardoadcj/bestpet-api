
package com.eacj.bestpet.domain.model;

import com.eacj.bestpet.util.StringListTools;
import java.util.ArrayList;
import java.util.List;


public class QuestCollection {

    public static List<Quest> quests = new ArrayList<>();
    
    static {
        
        quests.add(new Quest(
                "A",
                "Se você pudesse se definir em uma única palavra seria:",
                StringListTools.create(
                        "Brincalhão",
                        "Independente",
                        "Ocupado"
                )));
        
        quests.add(new Quest(
                "B",
                "Quanto tempo livre você tem por dia?",
                StringListTools.create(
                        "Bastante tempo livre para ficar em casa e aproveitar a vida.",
                        "Cada dia é diferente do outro.",
                        "Você trabalha bastante e viaja com frequência."
                )));
        
        quests.add(new Quest(
                "C",
                "Você gostaria de um animalzinho que seja:",
                StringListTools.create(
                        "Fácil de cuidar.",
                        "Sociável e companheiro.",
                        "Dócil e carinhoso, mas que não tome muito seu tempo."
                )));
        
        quests.add(new Quest(
                "D",
                "Para ter um pet você seria capaz de:",
                StringListTools.create(
                        "Passear ao ar livre diariamente.",
                        "Apenas alimentá-lo diariamente.",
                        "Lidar com o barulho sem problemas."
                )));
        
        quests.add(new Quest(
                "E",
                "Como é a sua casa?",
                StringListTools.create(
                        "Você mora em um apartamento.",
                        "Você mora em uma casa com quintal.",
                        "Você mora em uma casa de campo."
                )));
        
        quests.add(new Quest(
                "F",
                "O que você espera do seu pet:",
                StringListTools.create(
                        "Proteção e companheirismo.",
                        "Ter cuidados simples e evitar bagunça.",
                        "Deixar a casa mais alegre."
                )));
        
    }
    
}
