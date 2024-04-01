package com.practicalUse.cookat.stockSurvey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CookatNo implements Serializable {

    @Column(name = "Cookat_No")
    private int cookatNo;

    protected CookatNo() {}

    public CookatNo(int orderMemberNo) {
        this.cookatNo = orderMemberNo;
    }

    public int getOrderMemberNo() {
        return cookatNo;
    }

    @Override
    public String toString() {
        return "OrderMemberNo{" +
                "orderMemberNo=" + cookatNo +
                '}';
    }
}
