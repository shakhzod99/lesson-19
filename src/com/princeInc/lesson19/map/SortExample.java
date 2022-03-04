package com.princeInc.lesson19.map;

import com.princeInc.lesson19.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
  public static void main(String[] args) {
//    List.of();
//    List<String> strings = Arrays.asList("143", "123", "789", "00");
//    Collections.sort(strings);
//    System.out.println(strings);

    List<Person> personList = Arrays.asList(
        new Person(1, "Ivan", "Ivanov"),
        new Person(54, "Petr", "Petrov"),
        new Person(3, "Julia", "Julians")
    );
    Collections.sort(personList);
    System.out.println(personList);

    personList.sort(new FirstNameComparator());
    personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
    System.out.println(personList);
  }

  public static class FirstNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
      return o1.getFirstName().compareTo(o2.getFirstName());
    }
  }
}
