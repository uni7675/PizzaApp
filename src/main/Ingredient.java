package main;

import java.io.Serializable;

public class Ingredient implements Serializable {
    private final String name;
    private final Double weight;
    private final Double calories;

    public Ingredient(String name, Double weight, Double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }


    public Double getWeight() {
        return weight;
    }


    public Double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                '}';
    }
}