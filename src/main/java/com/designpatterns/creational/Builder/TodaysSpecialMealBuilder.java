package com.designpatterns.creational.Builder;

import com.designpatterns.creational.Builder.entities.ChickenBurger;
import com.designpatterns.creational.Builder.entities.Pepsi;

public class TodaysSpecialMealBuilder implements MealBuilder {

    @Override
    public Meal build() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
