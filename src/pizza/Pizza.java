package pizza;

import dough.Dough;
import main.Ingredient;

import java.io.Serializable;
import java.util.List;

public class Pizza implements Serializable {
    private final String name;
    private Dough dough;
    private final List<Ingredient> ingredients;
    private final int numberOfPreferredPizzaSlice;
    private Status status;

    public Pizza(String name, List<Ingredient> ingredients, int numberOfPreferredPizzaSlice) {
        this.name = name;
        this.ingredients = ingredients;
        this.numberOfPreferredPizzaSlice = numberOfPreferredPizzaSlice;
        this.status = Status.NOT_STARTED;
    }

    public int getNumberOfPreferredPizzaSlice() {
        return numberOfPreferredPizzaSlice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", ingredients=" + ingredients +
                ", numberOfPreferredPizzaSlice=" + numberOfPreferredPizzaSlice +
                ", status=" + status +
                '}';
    }
}
