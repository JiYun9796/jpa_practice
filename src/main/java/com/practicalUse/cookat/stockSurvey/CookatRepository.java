package com.practicalUse.cookat.stockSurvey;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CookatRepository {

    @PersistenceContext
    private EntityManager manager;


    public void cookatSave(OrderCookat orderCookat) {
        manager.persist(orderCookat);
    }
}
