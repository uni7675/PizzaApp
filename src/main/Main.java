package main;


import container.*;
import dough.Dough;
import pizza.Pizza;
import utli.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        boolean continueOrNot = true;


        printWithNewLine("please fill your pizza order");
        printWithoutNewLine("pizza name");
        String pizzaName = input.nextLine();
        printNewLine();

        printWithNewLine("please fill your pizza ingredients");
        String ingredientName = "";
        double ingredientWeight = 0;
        double ingredientCalories = 0;

        while (continueOrNot) {

            printWithoutNewLine("ingredient name");
            ingredientName = input.nextLine();
            printNewLine();

            printWithoutNewLine("ingredient weight");
            ingredientWeight = input.nextDouble();
            printNewLine();

            printWithoutNewLine("ingredient calories");
            ingredientCalories = input.nextDouble();
            printNewLine();

            ingredients.add(new Ingredient(ingredientName, ingredientWeight, ingredientCalories));

            printWithoutNewLine("type [false] if there's no ingredients to add,[true] for continue");
            continueOrNot = input.nextBoolean();
            input.nextLine();
            printNewLine();
        }

        printWithoutNewLine("number of preferred pizza slice");
        int numberOfPreferredPizzaSlice = input.nextInt();
        printNewLine();

        Pizza pizza = new Pizza(pizzaName, ingredients, numberOfPreferredPizzaSlice);
        printPizzaStatus(pizza);

        printWithNewLine("please choose Pizza Size by press the position number from this list:");
        printWithoutNewLine(Arrays.toString(Size.values()));
        Size pizzaSize = Size.values()[input.nextInt() - 1];
        printNewLine();

        printWithNewLine("please choose Container Type by press the position number from this list:");
        printWithoutNewLine(Arrays.toString(ContainerType.values()));
        ContainerType containerType = ContainerType.values()[input.nextInt() - 1];
        printNewLine();


        Mixer mixer = new Mixer();
        mixer.updatePizzaStatus(pizza);
        printPizzaStatus(pizza);

        Dough dough = mixer.makePizzaDough(pizzaSize);

        pizza.setDough(dough);

        Container container = new Container(containerType);
        container.doughPour(dough);
        container.updatePizzaStatus(pizza);

        printPizzaStatus(pizza);
        printWithNewLine("-------------------------------------------------------");
        printWithNewLine("your Pizza order: ");
        printWithNewLine(pizza.toString());
    }

    private static void printWithoutNewLine(String text) {
        System.out.print(text + ": ");
    }

    private static void printWithNewLine(String text) {
        System.out.println(text);
    }

    private static void printNewLine() {
        System.out.println();
    }

    private static void printPizzaStatus(Pizza pizza) {
        String pizzaStatus = pizza.getStatus().name();
        printWithNewLine("---------------------Your Pizza status " + pizzaStatus + "---------------------");
    }
}







