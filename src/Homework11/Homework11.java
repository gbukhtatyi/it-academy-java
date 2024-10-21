package Homework11;

import Homework11.airline.*;

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

        if (cash.compareTo(cashTwo)) {
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
        Airplane airplane = new Airplane("Самолет", 1000,1000);
        Helicopter helicopter = new Helicopter("Вертолет", 100, 100);
        Quadcopter quadcopter = new Quadcopter("", 10,10);

        Company airline = new Company(new FlyingMachine[]{airplane, helicopter, quadcopter});

        System.out.println("Общая вместимость: " + airline.getCapacity());
        System.out.println("Общая грузоподъемность: " + airline.getLoadCapacity());

        try {
            FlyingMachine machine = airline.search("Самолет", 1000, 10);
            System.out.println("Найдено: " + machine.toString());
        } catch (Exception exp){
            System.out.println("Ошибка! " + exp.getMessage());
        }
    }
}
