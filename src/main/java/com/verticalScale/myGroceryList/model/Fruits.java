package com.verticalScale.myGroceryList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fruits {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private double nutritionValue;
    private double monthlyQuota;
    private int userId;
}
