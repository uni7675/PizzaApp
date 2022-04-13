package container;


import utli.Size;

public enum ContainerType {
    DEEP_DISH("Deep Dish", 500, Size.MEDIUM),

    PAN("Pan", 120, Size.SMALL);

    private final double weight;
    private final Size size;
    private final String name;

    ContainerType(String name, double weight, Size size) {
        this.weight = weight;
        this.size = size;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
