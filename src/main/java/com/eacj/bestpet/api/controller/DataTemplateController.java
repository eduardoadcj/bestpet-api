package com.eacj.bestpet.api.controller;

import com.eacj.bestpet.domain.model.AnimalCollection;
import com.eacj.bestpet.domain.model.Quest;
import com.eacj.bestpet.domain.model.QuestCollection;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataTemplateController {

    @GetMapping
    @RequestMapping("/quests")
    public List<Quest> getQuests() {
        return QuestCollection.quests;
    }

    @GetMapping
    @RequestMapping("/animals")
    public List<String> getAnimals() {
        return AnimalCollection.animals;
    }
    
}
