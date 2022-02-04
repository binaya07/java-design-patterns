package com.designpatterns.creational.Builder;

public interface MealBuilder {
    Meal build();

    // Instead of building a whole meal at once,
    // you can also opt to build parts of meal using different functions
    // and return the finished meal at last.
    // For ex:
    // void buildDrinks(Drink drinkItem);
    // void buildMainCourse(Item mainCourseItem);
    // void buildAppetizer(Item appetizerItem);
    // Meal get();
}
