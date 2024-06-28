package object1;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John", 30, 160);
        System.out.println("John's height is " + person1.getHeight());
        System.out.println("John's age is " + person1.getAge());
        System.out.println();

        Car car1 = new Car("Honda", "CRV", 2024, 1000);
        System.out.println("The make of this car is " + car1.getMake());
        System.out.println("The model of this car is " + car1.getModel());
        System.out.println("The year is " + car1.getYear() + " and mileage is " + car1.getMileage());
        System.out.println();

        Chair chair1 = new Chair("wood", "brown", 4);
        System.out.println("This chair is made out of " + chair1.getMaterial());
        System.out.println("It's color is " + chair1.getColor());
        System.out.println("And it has " + chair1.getLegs());
        System.out.println();

        Dog dog1 = new Dog("Max,", 10, "corgi");
        System.out.println(dog1.getName() + " is a " + dog1.getAge() + " year old " + dog1.getBreed() + ".");

        PersonArray[] people;
        people = new PersonArray[][10];

        PersonArray person3 = new PersonArray("Alice", 25);
        PersonArray person2 = new PersonArray("Bob", 30);

        people[0] = person3;
        people[1] = person2;


    }
}
