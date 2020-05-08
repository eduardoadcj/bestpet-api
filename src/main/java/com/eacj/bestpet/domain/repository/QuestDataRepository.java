package com.eacj.bestpet.domain.repository;

import com.eacj.bestpet.domain.model.QuestData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestDataRepository extends JpaRepository<QuestData, Long>{
    
}
