package homework11.airline;

public abstract class FlyingMachine {

    protected String name;

    protected int capacity;

    protected int loadCapacity;

    public FlyingMachine(String name, int capacity, int loadCapacity) {
        this.name = name;
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public String toString() {
        return getName()
                + ", вместимость: " + getCapacity()
                + ", грузоподъемность: " + getLoadCapacity();
    }
}
