
package com.eacj.bestpet.domain.service;

import com.eacj.bestpet.domain.model.QuestData;
import com.eacj.bestpet.domain.repository.QuestDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestDataService {
    
    @Autowired
    private QuestDataRepository dataRepository;
    
    public QuestData register(QuestData questData){
        return dataRepository.save(questData);
    }
    
}
