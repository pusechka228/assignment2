package oop;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("Preston", "Northwest", "Businessman", 2500000));
        people.add(new Student("Dipper", "Pines", 4.0));
        people.add(new Student("Mabel", "Pines", 2.3));
        people.add(new Employee("Wendy", "Corduroy", "Lifeguard", 150000.67));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.println(
                    p.toString() + " earns " +
                            String.format("%.2f", p.getPaymentAmount()) + " tenge"
            );
        }
    }
}
