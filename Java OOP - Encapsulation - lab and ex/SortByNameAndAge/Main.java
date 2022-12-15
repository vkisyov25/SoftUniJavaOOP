package EncapsulationSoftUni.SortByNameAndAge;

import java.io.*;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException {
            Scanner reader = new Scanner(System.in);
            int numberOfPeople = Integer.parseInt(reader.nextLine());

            List<Person> people = new ArrayList<>();

            for (int i = 0; i < numberOfPeople; i++) {
                String[] input = reader.nextLine().split(" ");
                people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
            }

            Collections.sort(people, (firstPerson, secondPerson) -> {
                int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

                if (sComp != 0) {
                    return sComp;
                } else {
                    return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
                }
            });

            for (Person person : people) {
                System.out.println(person.toString());
            }
        }

    }

