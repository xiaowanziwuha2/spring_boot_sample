package com.boot.demo.lamda;

import java.math.BigDecimal;

public class Shape {
    private String color;

    private BigDecimal amount;

    public Shape(){
        super();
    }

    public Shape(String color, BigDecimal amount) {
        this.color = color;
        this.amount = amount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
