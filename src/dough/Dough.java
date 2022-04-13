package dough;

import utli.Size;

public class Dough {
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
