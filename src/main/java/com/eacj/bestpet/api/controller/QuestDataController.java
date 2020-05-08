package com.eacj.bestpet.api.controller;

import com.eacj.bestpet.domain.model.QuestData;
import com.eacj.bestpet.domain.service.QuestDataService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questdatas")
public class QuestDataController {
    
    @Autowired
    private QuestDataService dataService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public QuestData register(@Valid @RequestBody QuestData questData){
        return dataService.register(questData);
    }
    
}
