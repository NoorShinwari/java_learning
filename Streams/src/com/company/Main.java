package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        List<String> someBingoNumbers = Arrays.asList(
//                "N40", "N36", "B12", "B6", "G53", "G49", "G60", "G50", "g64", "I26", "I17", "I29", "O71"
//        );
//        List<String> gNumbers = new ArrayList<>();
//
////        someBingoNumbers.forEach(number -> {
////            if (number.toUpperCase().startsWith("G")) {
////                gNumbers.add(number);
//////                System.out.println(number);
////            }
////        });
//////        gNumbers.sort((s1,s2) -> s1.compareTo(s2));
//////        gNumbers.forEach((s -> System.out.println(s)));
////        gNumbers.sort(String::compareTo);
////        gNumbers.forEach((System.out::println));
//
//        someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .forEach(System.out::println);
//
//        Stream<String> ioNumberStream = Stream.of("I26","I17","I29","O71");
//        Stream<String> inNumberStream = Stream.of("N40","N36","I26","I17","I29","O71");
//        Stream<String> concatStream = Stream.concat(ioNumberStream,inNumberStream);
////        System.out.println("=================================================");
////        System.out.println(concatStream
////                .distinct()
////                .peek(System.out::println)
////                .count()
////        );
//
//        Employee john = new Employee("John Doe", 30);
//        Employee jane = new Employee("Jane Deer", 25);
//        Employee jack = new Employee("Jack Hill", 40);
//        Employee snow = new Employee("Snow White", 22);
//
//        Department hr = new Department("Human Resources");
//
//        hr.addEmployee(jane);
//        hr.addEmployee(jack);
//        hr.addEmployee(snow);
//
//        Department accounting = new Department("Accounting");
//        accounting.addEmployee(john);
//
//        List<Department> departments = new ArrayList<>();
//        departments.add(hr);
//        departments.add(accounting);
//
//
//        departments.stream()
//                .flatMap(department -> department.getEmployees().stream())
//                .forEach(System.out::println);
//
////        List<String> sortedGNumbers = someBingoNumbers
////                .stream()
////                .map(String::toUpperCase)
////                .filter(s -> s.startsWith("G"))
////                .sorted()
////                .collect(Collectors.toList());
//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//      //                    "Supplier" , "Accumulator",  "Combiner"
//        System.out.println("********************************");
//        for (String s : sortedGNumbers) {
//            System.out.println(s);
//        }
//        Map<Integer, List<Employee>> groupByAge = departments
//                .stream()
//                .flatMap(department -> department.getEmployees().stream())
//                .collect(Collectors.groupingBy(Employee::getAge));
//        System.out.println("********************************");
//        departments.stream()
//                .flatMap(department -> department.getEmployees().stream())
//                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
//                .ifPresent(System.out::println);
//        System.out.println("********************************");




//        // Task 1;
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part : parts) {
//                    System.out.println(part);
//                }
//            }
//
//        };
//
//        new Thread(() -> {
//            String myString = "Let's split this up into an array";
//            Arrays.stream(myString.split(" "))
//                    .forEach(System.out::println);
//
//        }).start();
//        Function<String, String> everySecondChar =  source -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < source.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(source.charAt(1));
//                }
//            }
//            return returnVal.toString();
//
//        };
//      String result =  everySecondCharacter(everySecondChar, "12345678");
//
//        Supplier<String> iLoveJava = () -> "I love Java";
//        String supplierResult = iLoveJava.get();
//        System.out.println(supplierResult);


        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
    topNames2015.stream()
                .map(e -> e.substring(0,1).toUpperCase() + e.substring(1))
                .filter(e -> e.startsWith("A"))
                .sorted()
          .forEach(System.out::println);
      // newStream.forEach(System.out::println);


    }
    public static String everySecondCharacter(Function<String,String> func, String source) {
        return func.apply(source);
    }


    // Task: 2
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(1));
            }
        }
        return returnVal.toString();
    }




}
