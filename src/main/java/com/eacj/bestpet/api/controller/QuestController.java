
package com.eacj.bestpet.api.controller;

import com.eacj.bestpet.domain.model.Quest;
import com.eacj.bestpet.domain.model.QuestCollection;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quests")
public class QuestController {
    
    @GetMapping
    public List<Quest> get(){
        return QuestCollection.quests;
    }
    
}
