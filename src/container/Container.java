package container;

import dough.Dough;
import pizza.*;
import main.Ingredient;
import utli.Update;

import java.util.List;

public class Container implements Update {
    private final ContainerType containerType;
    private Dough dough;
    private List<Ingredient> ingredients;
    private Double sumOfIngredientsWeights;

    public Container(ContainerType containerType) {
        this.containerType = containerType;
    }

    public ContainerType getDishType() {
        return containerType;
    }

    public Dough getPouredDough() throws Exception {
        if (dough == null) {
            throw new Exception("dough not poured into " + getDishType().getName());
        }
        return dough;
    }

    public Double getSumOfIngredientsWeights() {
        return sumOfIngredientsWeights;
    }

    public void doughPour(Dough dough) throws Exception {
        if (dough.getSize().ordinal() > containerType.getSize().ordinal()) {
            throw new Exception("dough size exceeded " + containerType.getName() + " utli.Size limit");
        }
        this.dough = dough;
    }

    public void addIngredients(List<Ingredient> ingredients) throws Exception {
        if (sumOfIngredientWeights(ingredients) > containerType.getWeight()) {
            throw new Exception("ingredients weights exceeded " + containerType.getName() + " weight limit");
        }
        this.ingredients = ingredients;
    }

    public Double getIngredientsCaloriesSum() {
        double caloriesSum = 0;
        for (Ingredient ingredient : ingredients) {
            caloriesSum += ingredient.getCalories();
        }
        return caloriesSum;
    }

    public void updatePizzaStatus(Pizza pizza) {
        pizza.setStatus(Status.READY);
    }

    public double getContainerFinalSize() throws Exception {
        if (sumOfIngredientsWeights == null) {
            throw new Exception("dough should be poured to the  " + containerType.getName());
        }
        return sumOfIngredientsWeights + getIngredientsCaloriesSum();
    }

    private double sumOfIngredientWeights(List<Ingredient> ingredients) {
        double sum = 0;
        for (Ingredient ingredient : ingredients) {
            sum += ingredient.getWeight();
        }
        sumOfIngredientsWeights = sum;
        return sum;
    }

    @Override
    public String toString() {
        return "Container{" +
                "containerType=" + containerType +
                ", dough=" + dough +
                ", ingredients=" + ingredients +
                ", sumOfIngredientsWeights=" + sumOfIngredientsWeights +
                '}';
    }
}