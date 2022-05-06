package main;

import dough.Dough;
import pizza.*;
import utli.Size;
import utli.Update;

import java.io.Serializable;


public class Mixer implements Update, Serializable {
    public void updatePizzaStatus(Pizza pizza) {
        pizza.setStatus(Status.IN_PROCESS);
    }

    public Dough makePizzaDough(Size size) {
        return new Dough(size);
    }
}
