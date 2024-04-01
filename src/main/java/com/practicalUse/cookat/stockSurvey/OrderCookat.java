package com.practicalUse.cookat.stockSurvey;

import jakarta.persistence.*;

@Entity
@Table
public class OrderCookat {

    @EmbeddedId
    private CookatNo cookatNo;
    private String cookatName;
    private int cookatAmount;
    private int cookatPrice;
    private double cookatDiscount;

    protected OrderCookat() {}

    public OrderCookat(CookatNo memberNo, String cookatName, int cookatAmount, int cookatPrice, double cookatDiscount) {
        this.cookatNo = memberNo;
        this.cookatName = cookatName;
        this.cookatAmount = cookatAmount;
        this.cookatPrice = cookatPrice;
        this.cookatDiscount = cookatDiscount;
    }

    public OrderCookat(String cookatName, int cookaAmount, int cookaPrice, double cookaDiscount) {
    }

    public CookatNo getMemberInfo() {
        return cookatNo;
    }

    public String getCoffeeName() {
        return cookatName;
    }

    public int getOrderAmount() {
        return cookatAmount;
    }

    public int getOrderPrice() {
        return cookatPrice;
    }

    public double getOrderDiscount() {
        return cookatDiscount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberInfo=" + cookatNo +
                ", coffeeName='" + cookatName + '\'' +
                ", orderAmount=" + cookatAmount +
                ", orderPrice=" + cookatPrice +
                ", orderDiscount=" + cookatDiscount +
                '}';
    }
}
