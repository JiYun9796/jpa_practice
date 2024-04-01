package com.practicalUse.cookat.stockSurvey;

public class CookatDTO {

    private int cookatNo;
    private String cookatName;
    private int cookaAmount;
    private int cookaPrice;
    private double cookaDiscount;

    public CookatDTO() {
    }

    public CookatDTO(int orderMemberNo, String coffeeName, int orderAmount, int orderPrice, double orderDiscount) {
        this.cookatNo = cookatNo;
        this.cookatName = cookatName;
        this.cookaAmount = cookaAmount;
        this.cookaPrice = cookaPrice;
        this.cookaDiscount = cookaDiscount;
    }

    public int getCookatNo() {
        return cookatNo;
    }

    public String getCookatName() {
        return cookatName;
    }

    public int getCookaAmount() {
        return cookaAmount;
    }

    public int getCookaPrice() {
        return cookaPrice;
    }

    public double getCookaDiscount() {
        return cookaDiscount;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderMemberNo=" + cookatNo +
                ", coffeeName='" + cookatName + '\'' +
                ", orderAmount=" + cookaAmount +
                ", orderPrice=" + cookaPrice +
                ", orderDiscount=" + cookaDiscount +
                '}';
    }
}
