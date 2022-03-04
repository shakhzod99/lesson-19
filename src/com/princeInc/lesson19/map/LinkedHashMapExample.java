package com.princeInc.lesson19.map;

import com.princeInc.lesson19.person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
  public static void main(String[] args) {
    Person ivan = new Person(1, "Ivan", "Ivanov");
    Person petr = new Person(22, "Petr", "Petrov");
    Person john = new Person(33, "John", "Wick");

    Map<Integer, Person> map = new LinkedHashMap<>();
    map.put(ivan.getId(), ivan);
    map.put(petr.getId(), petr);
    map.put(john.getId(), john);

    for (Map.Entry<Integer, Person> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " -- " + entry.getValue());
    }
  }
}
