package Exp1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat[] pets = {
                new Cat("Barsik", 2),
                new Cat("Murzik", 7),
                new Cat("Markiz", 5),
                new Cat("Tom", 3),
                new Cat("Pushok", 1),
                new Cat("Snezhok", 2),
                new Cat("Vas'ka", 5),
                new Cat("Bonya", 4)
        };

        System.out.println("Укажите первоначальное количество еды в миске:");
        Plate plate = new Plate(new Scanner(System.in).nextInt());

        for (Cat c : pets) {
            while (!c.isFullness() && plate.getFood() >= c.getAppetite()) {     // если кот ещё не сыт и в миске лежит больше, чем кот съедает за раз -
                c.eat(plate);                                                   // кот ест из тарелки
                plate.info();
            }

        }
        for (Cat c : pets) {
            if (c.isFullness()) {
                System.out.printf("%s наелся\n", c.getName());
            } else {
                System.out.printf("%s остался голодным, ему не хватило %d единиц еды\n", c.getName(), c.getCatFullness() - c.getSaturationFood());
            }
        }
    }
}
