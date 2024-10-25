package Homework11.airline;

import java.util.ArrayList;

public class Company {
    protected FlyingMachine[] flyingMachines;

    public Company(FlyingMachine[] flyingMachines) {
        this.flyingMachines = flyingMachines;
    }

    public FlyingMachine[] getFlyingMachines() {
        return flyingMachines;
    }

    public ArrayList<FlyingMachine> search(String name, int capacity, int loadCapacity) throws Exception {
        ArrayList<FlyingMachine> result = new ArrayList<FlyingMachine>();
        for (FlyingMachine machine : flyingMachines) {
            if (!machine.getName().equals(name)) {
                continue;
            }

            if (machine.getCapacity() < capacity) {
                continue;
            }

            if (machine.getLoadCapacity() < loadCapacity) {
                continue;
            }

            result.add(machine);
        }

        if (result.isEmpty()) {
            throw new Exception("Не удалось подобрать летательный аппарат");
        }

        return result;
    }

    public int getCapacity() {
        int result = 0;
        for (FlyingMachine machine : flyingMachines) {
            result += machine.getCapacity();
        }

        return result;
    }

    public int getLoadCapacity() {
        int result = 0;
        for (FlyingMachine machine : flyingMachines) {
            result += machine.getLoadCapacity();
        }

        return result;
    }
}
