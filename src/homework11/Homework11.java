package homework11;

import homework11.airline.*;

import java.util.ArrayList;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("Задание 1. Класс Money");
        exercise1();

        System.out.println("\nЗадание 2. Аэропорт");
        exercise2();
    }

    public static void exercise1() {
        Money cash = new Money(5, 17);
        Money cashTwo = new Money(5, 27);

        if (cash.compareTo(cashTwo) == 0) {
            System.out.println("Суммы наличных равны");
        } else {
            System.out.println("Суммы наличных не равны");
        }

        cash.add(cashTwo);
        System.out.println(cash.toString());

        cash.subtract(cashTwo);
        System.out.println(cash.toString());
    }

    public static void exercise2() {
        Airplane airplane = new Airplane("Самолет", 1000, 1000);
        Airplane airplane2 = new Airplane("Самолет", 100, 100);
        Helicopter helicopter = new Helicopter("Вертолет", 100, 100);
        Quadcopter quadcopter = new Quadcopter("Квадрокоптер", 10, 10);

        Company airline = new Company(new FlyingMachine[]{airplane, airplane2, helicopter, quadcopter});

        System.out.println("Общая вместимость: " + airline.getCapacity());
        System.out.println("Общая грузоподъемность: " + airline.getLoadCapacity());

        try {
            ArrayList<FlyingMachine> machines = airline.search("Самолет", 100, 10);
            System.out.println("Найдено: ");
            for (FlyingMachine machine : machines) {
                System.out.println(" * " + machine.toString());
            }
        } catch (Exception exp) {
            System.out.println("Ошибка! " + exp.getMessage());
        }
    }
}
