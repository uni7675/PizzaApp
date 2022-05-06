package main;


import container.Container;
import pizza.Pizza;

import java.io.Serializable;

public class SystemComponent implements Serializable {
    final private Pizza pizza;
    final private Mixer mixer;
    final private Container container;

    public SystemComponent(Pizza pizza, Mixer mixer, Container container) {
        this.pizza = pizza;
        this.mixer = mixer;
        this.container = container;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Mixer getMixer() {
        return mixer;
    }

    public Container getContainer() {
        return container;
    }

    @Override
    public String toString() {
        return "SystemComponent{" +
                "pizza=" + pizza +
                ", mixer=" + mixer +
                ", container=" + container +
                '}';
    }
}