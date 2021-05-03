package com.verticalScale.myGroceryList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DailyEssentials {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private double nutritionValue;
    private double monthlyQuota;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNutritionValue() {
        return nutritionValue;
    }

    public void setNutritionValue(double nutritionValue) {
        this.nutritionValue = nutritionValue;
    }

    public double getMonthlyQuota() {
        return monthlyQuota;
    }

    public void setMonthlyQuota(double monthlyQuota) {
        this.monthlyQuota = monthlyQuota;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
