package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//	 String string = "I am a string. Yes, I am";
//      String newString =  string.replaceAll("I", "You");
//        System.out.println(newString);
//
//        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(alphanumeric.replaceAll(".","Y"));
//        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));
//        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
//        System.out.println(secondString.replaceAll("^abcDeee","YYY"));

//        String string = "I want a bike.";
//        String string2 = "I want a ball.";
//
//        String reqExp3 = "I want a \\w+.";
//        Pattern pattern = Pattern.compile(reqExp3);
//        Matcher matcher = pattern.matcher(string);
//        Matcher matcher2 = pattern.matcher(string2);
//        System.out.println(matcher.matches());
//        System.out.println(matcher2.matches());

        String challenge4 = "Replace all blanks with underscores.";
//        System.out.println(challenge4.replaceAll("\\s", "_"));

//        String challenge5 = "aaabccccccccdddeffg";
//        System.out.println(challenge5.matches("[a-g]+"));

        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));
        System.out.println(challenge7.matches("^\\D+\\.\\d+$"));
        int count = 0;
    }
}
