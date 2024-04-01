package com.practicalUse.cookat.stockSurvey;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CookatService {

    private CookatRepository cookatRepository;

    public CookatService(CookatRepository cookatRepository) {
        this.cookatRepository = cookatRepository;
    }

    @Transactional
    public void orderCookat(CookatDTO cookatDTO) {
        OrderCookat orderCookat = new OrderCookat(
                cookatDTO.getCookatName(),
                cookatDTO.getCookaAmount(),
                cookatDTO.getCookaPrice(),
                cookatDTO.getCookaDiscount());

        cookatRepository.cookatSave(orderCookat);
    }
}
