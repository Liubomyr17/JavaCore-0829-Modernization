package com.company;

/*
0829 Модернизация ПО
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон
Пример вывода:
Абрамовичи
Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна вывести фамилию семьи по введенному городу.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<Person> addresses = new ArrayList<Person>();

        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String secondName = reader.readLine();
            addresses.add(new Person(city, secondName));

        }

        String city = reader.readLine();
        for (Person person : addresses)
            if (person.getCity().equals(city))
                System.out.println(person.getSecondName());
    }

    static class Person {
        private String city;
        private String secondName;

        public Person(String city, String secondName) {
            this.city = city;
            this.secondName = secondName;
        }

        public String getCity() {
            return city;
        }

        public String getSecondName() {
            return secondName;
        }
    }
}





