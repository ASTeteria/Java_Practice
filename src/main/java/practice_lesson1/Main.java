package practice_lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person Vasya = new Person( "Vasya", 23);
        Person Petya = new Person( "Petya", 3);
        System.out.println(Vasya);
        System.out.println(Petya);

        Person[] persons = new Person[]{Vasya, Petya};
        System.out.println(Arrays.toString(persons));

        ArrayList<Person> personsList = new ArrayList<>();
        personsList.add(Vasya);
        personsList.add(Petya);
        personsList.add(new Person("Lena", 18));
        System.out.println(personsList);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
            System.out.println(personsList.get(i));
        }

        for(Person person: persons) {
            System.out.println(person);

        }

        for(Person person: personsList) {
            System.out.println(person);
        }


        int index = 0;
        do {
            System.out.println(persons[index]);
        }while(++index < persons.length);

        index = 0;
        while(index < persons.length) {
            System.out.println(persons[index++]);

        }
    }
}
