package dough;

import utli.Size;

import java.io.Serializable;

public class Dough implements Serializable {
    private final Size size;

    public Dough(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Dough{" +
                "size=" + size +
                '}';
    }
}
