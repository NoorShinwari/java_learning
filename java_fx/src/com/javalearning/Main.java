package com.javalearning;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        printList((List<Theatre.Seat>) theatre.getSeats());

    }

    public static void printList(List<Theatre.Seat> list) {

        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }

        System.out.println();
        System.out.println(
                "==================================================================================================");

    }
}
