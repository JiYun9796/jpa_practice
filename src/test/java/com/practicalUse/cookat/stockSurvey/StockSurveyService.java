package com.practicalUse.cookat.stockSurvey;

import org.springframework.stereotype.Service;

@Service
public class StockSurveyService {

    public Object updateStock(String cookateName, int updatedStock) {
        return true;
    }

    public int getStock(String productName) {
        return 0; // <<임시로 0을 설정
    }
}
