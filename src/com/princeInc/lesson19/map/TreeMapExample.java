package com.princeInc.lesson19.map;

import com.princeInc.lesson19.person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
  public static void main(String[] args) {
    Person ivan = new Person(1, "Ivan", "Ivanov");
    Person petr = new Person(29, "Petr", "Petrov");
    Person john1 = new Person(3, "John1", "Wick1");
    Person john2 = new Person(45, "John2", "Wick2");
    Person john3 = new Person(12, "John3", "Wick3");

    Map<Integer, Person> map = new TreeMap<>();
    map.put(ivan.getId(), ivan);
    map.put(petr.getId(), petr);
    map.put(john1.getId(), john1);
    map.put(john2.getId(), john2);
    map.put(john3.getId(), john3);

    for (Map.Entry<Integer, Person> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
  }
}
