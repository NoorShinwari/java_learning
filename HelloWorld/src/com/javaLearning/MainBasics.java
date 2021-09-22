package com.javaLearning;

import java.util.Scanner;

public class MainBasics {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");
        // int myFirstNumber= 5;
        // System.out.println(myFirstNumber);
        // int mySecondNumber= 12;
        // int myThirdNumber = 6;
        // System.out.println(mySecondNumber + " + " + myThirdNumber);

        // byte myByteValue = 127;
        // short myShortValue = 13456;
        // int myIntValue = 123456;
        // long myLongValue = 50000L +( 10L* (myByteValue + myShortValue +myIntValue));

        // System.out.println(myLongValue);

        // double onePound = 0.45359237;
        // double pounds = 100;
        // double kilos = pounds*onePound;
        // System.out.println(kilos);

        // boolean isAlien=true;
        // if (!isAlien) {
        // System.out.println("It is not an alien!");
        // }

        // int counter=0;
        // while (counter<10) {
        // System.out.println(counter);
        // counter++;
        // }
        // --------------------------------------------------------------------------------------------------------------

        // printConversion(1.5);
        // printConversion(10.25);
        // printConversion(-5.6);
        // printConversion(25.42);
        // printConversion(75.114);

        // ---------------------------------------------------------------------------------------------------------------

        // printMegaBytesAndKiloBytes(2500);
        // printMegaBytesAndKiloBytes(-1024);
        // printMegaBytesAndKiloBytes(5000);

        // ---------------------------------------------------------------------------------------------------------------

        // System.out.println(shouldWakeUp(true, 1)

        // );
        // System.out.println(shouldWakeUp(false, 2)

        // );
        // System.out.println(shouldWakeUp(true, 8)

        // );
        // System.out.println(shouldWakeUp(true, -1)

        // );

        // -------------------------------------------------------------------------------------------------------------------
        // System.out.println(isLeapYear(1700)

        // );
        // System.out.println(isLeapYear(1800)

        // );
        // System.out.println(isLeapYear(2200)

        // );
        // System.out.println(isLeapYear(2300)

        // );

        // ---------------------------------------------------------------------------------------------------------------------

        // System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        // System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        // System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        // System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        // ------------------------------------------------------------------------------------------------------------------------

        // System.out.println(hasEqualSum(1, 1, 1));
        // System.out.println(hasEqualSum(1, 1, 2));
        // System.out.println(hasEqualSum(1, -1, 0));

        // ------------------------------------------------------------------------------------------------------------------------

        // System.out.println(hasTeen(9, 99, 19));
        // System.out.println(hasTeen(23, 15, 42));
        // System.out.println(hasTeen(22, 23, 34));

        // -------------------------------------------------------------------------------------------------------------------------

        // calcFeetAndInchesToCentimeters(0, 13);

        // -------------------------------------------------------------------------------------------------------------------------

        // System.out.println(getDurationString(70, 59));
        // System.out.println(getDurationString(3661));

        // --------------------------------------------------------------------------------------------------------------------------

        // printYearsAndDays(525600);
        // printYearsAndDays(1051200);
        // printYearsAndDays(561600);

        // --------------------------------------------------------------------------------------------------------------------------

        // printEqual(1, 1, 1);
        // printEqual(1, 1, 2);
        // printEqual(-1, -1, -1);
        // printEqual(1, 2, 3);

        // -----------------------------------------------------------------------------------------------------------------------------
        // System.out.println(isCatPlaying(true, 33));
        // System.out.println(isCatPlaying(false, 36));
        // System.out.println(isCatPlaying(false, 35));

        // ------------------------------------------------------------------------------------------------------------------------------

        // testChar('A');
        // testChar('B');
        // testChar('C');
        // testChar('D');
        // testChar('E');
        // testChar('F');

        // ------------------------------------------------------------------------------------------------------------------------------

        // printDayOfTheWeek(0);
        // printDayOfTheWeek(1);
        // printDayOfTheWeek(2);
        // printDayOfTheWeek(3);
        // printDayOfTheWeek(4);
        // printDayOfTheWeek(5);
        // printDayOfTheWeek(6);
        // printDayOfTheWeek(7);

        // ------------------------------------------------------------------------------------------------------------------------------

        // dayOfTheWeekChallange(0);
        // dayOfTheWeekChallange(1);
        // dayOfTheWeekChallange(2);
        // dayOfTheWeekChallange(3);
        // dayOfTheWeekChallange(4);
        // dayOfTheWeekChallange(5);
        // dayOfTheWeekChallange(6);
        // dayOfTheWeekChallange(7);

        // ------------------------------------------------------------------------------------------------------------------------------
        // printNumberInWord(0);
        // printNumberInWord(1);
        // printNumberInWord(2);
        // printNumberInWord(3);
        // printNumberInWord(4);
        // printNumberInWord(5);
        // printNumberInWord(6);
        // printNumberInWord(7);
        // printNumberInWord(8);
        // printNumberInWord(9);
        // printNumberInWord(10);

        // -----------------------------------------------------------------------------------------------------------------------------------

        // System.out.println(isLeapYear(-1600));
        // System.out.println(isLeapYear(1600));
        // System.out.println(isLeapYear(2017));
        // System.out.println(isLeapYear(2000));

        // ----------------------------------------------------------------------------------------------------------------------------------

        // System.out.println(getDaysInMonth(1, 2020));
        // System.out.println(getDaysInMonth(2, 2020));
        // System.out.println(getDaysInMonth(2, 2018));
        // System.out.println(getDaysInMonth(-1, 2020));
        // System.out.println(getDaysInMonth(1, -2020));

        // ----------------------------------------------------------------------------------------------------------------------------------
        // forLoop();

        // -----------------------------------------------------------------------------------------------------------------------------------

        // forLoopReverse();

        // ----------------------------------------------------------------------------------------------------------------------------------

        // primeCount(new int[50]);

        // -----------------------------------------------------------------------------------------------------
        // sumThreeAndFive(new int[100]);

        // -------------------------------------------------------------------------------------------------------------

        // System.out.println(sumOdd(1, 100));
        // System.out.println(sumOdd(-1, 100));
        // System.out.println(sumOdd(100, 100));
        // System.out.println(sumOdd(13, 13));
        // System.out.println(sumOdd(100, -100));
        // System.out.println(sumOdd(100, 1000));
        // System.out.println(sumOdd(10, 5));

        // --------------------------------------------------------------------------------------------------------------------------------------

        // System.out.println(getSumEvenNumbersOfFive());

        // ----------------------------------------------------------------------------------------------------------------------------------------

        // sumDigits(125333);

        // -----------------------------------------------------------------------------------------------------------------------------------

        // System.out.println("result -1221 -> " + isPalindrome(-1221));
        // System.out.println("******************************************************************************");

        // System.out.println("result 707 -> " + isPalindrome(707));
        // System.out.println("******************************************************************************");
        // System.out.println("result 112112 -> " + isPalindrome(11212));
        // System.out.println("******************************************************************************");

        // -----------------------------------------------------------------------------------------------------------------------------------------

        // sumFirstAndLastDigit(252);
        // sumFirstAndLastDigit(257);
        // sumFirstAndLastDigit(0);
        // sumFirstAndLastDigit(5);
        // sumFirstAndLastDigit(-10);
        // sumFirstAndLastDigit(10);
        // sumFirstAndLastDigit(0);

        // ---------------------------------------------------------------------------------------------------------------------------

        // getEvenDigitSum(123456789);
        // getEvenDigitSum(252);
        // getEvenDigitSum(-22);

        // -------------------------------------------------------------------------------------------------------------------------

        // hasSharedDigit(12, 13);
        // // hasSharedDigit(9, 99);
        // // hasSharedDigit(15, 55);
        // System.out.println("**************************************LOOL****************************************");

        // ---------------------------------------------------------------------------------------------------------------------------

        // hasSameLastDigit(41, 22, 71);
        // hasSameLastDigit(23, 32, 42);
        // hasSameLastDigit(9, 99, 999);
        // hasSameLastDigit(22, 23, 34);

        // ------------------------------------------------------------------------------------------------------------------------------

        // getGreatestCommonDivisor(25, 15);
        // getGreatestCommonDivisor(12, 30);
        // getGreatestCommonDivisor(9, 18);
        // getGreatestCommonDivisor(81, 153);

        // ---------------------------------------------------------------------------------------------------------------------------------------

        // printFactors(6);
        // System.out.println("**************************************LOOL****************************************");
        // printFactors(32);
        // System.out.println("**************************************LOOL****************************************");
        // printFactors(10);
        // System.out.println("**************************************LOOL****************************************");
        // printFactors(-1);

        // -------------------------------------------------------------------------------------------------------------------------------

        // isPerfectNumber(6);
        // System.out.println("**************************************LOOL****************************************");
        // isPerfectNumber(28);
        // System.out.println("**************************************LOOL****************************************");
        // isPerfectNumber(5);
        // System.out.println("**************************************LOOL****************************************");
        // isPerfectNumber(-1);

        // ----------------------------------------------------------------------------------------------------------------------------

        // numberToWords(234);
        // System.out.println("**************************************LOOL****************************************");
        // numberToWords(28);
        // System.out.println("**************************************LOOL****************************************");
        // numberToWords(5);
        // System.out.println("**************************************LOOL****************************************");
        // numberToWords(-1);

        // ----------------------------------------------------------------------------------------------------------
        // System.out.println("**************************************LOOL****************************************");
        // canPack(1, 0, 4);
        // System.out.println("**************************************LOOL****************************************");
        // canPack(1, 0, 5);
        // System.out.println("**************************************LOOL****************************************");
        // canPack(0, 5, 4);
        // System.out.println("**************************************LOOL****************************************");
        // canPack(2, 2, 11);
        // System.out.println("**************************************LOOL****************************************");
        // canPack(-3, 2, 12);
        // System.out.println("**************************************LOOL****************************************");
        // canPack(1, 0, 6);
        // ----------------------------------------------------------------------------------------------------------
        // System.out.println("**************************************LOOL****************************************");
        // getLargestPrime(21);
        // System.out.println("**************************************LOOL****************************************");
        // getLargestPrime(217);
        // System.out.println("**************************************LOOL****************************************");
        // getLargestPrime(0);
        // System.out.println("**************************************LOOL****************************************");
        // getLargestPrime(45);
        // System.out.println("**************************************LOOL****************************************");
        // getLargestPrime(-1);
        // System.out.println("**************************************LOOL****************************************");

        // System.out.println("**************************************LOOL****************************************");
        // printSquareStar(5);
        // System.out.println("**************************************LOOL****************************************");
        // printSquareStar(8);
        // System.out.println("**************************************LOOL****************************************");
        // printSquareStar(12);
        // System.out.println("**************************************LOOL****************************************");
        // printSquareStar(50);
        // System.out.println("**************************************LOOL****************************************");
        // printSquareStar(80);
        // System.out.println("**************************************LOOL****************************************");
        // printSquareStar(120);
        // System.out.println("**************************************LOOL****************************************");

        // System.out.println("**************************************LOOL****************************************");

        // askForAgeAndNameInput();
        // System.out.println("**************************************LOOL****************************************");

        // readingUserInputChallange();

        // --------------------------------------------------------------------------------------------------------

        // minAndMaxInputChallange();

        // ----------------------------------------------------------------------------------------------------------

        // inputThenPrintSumAndAverage();

        // ---------------------------------------------------------------------------------------------------------
        getBucketCount(-3.4, 2.1, 1.5, 2);
        getBucketCount(3.4, 2.1, 1.5, 2);
        getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println("**************************************LOOL****************************************");

        getBucketCount(3.4, 1.5);
        getBucketCount(6.26, 2.2);
        getBucketCount(3.26, 0.75);
        System.out.println("**************************************LOOL****************************************");

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {

            System.out.println("Invalid value");
        } else {

            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int YY = kiloBytes / 1024;
            int ZZ = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");

        }

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        }
    }

    // public static boolean isLeapYear(int year) {

    // if (!((year == 1 || year > 1) && (year < 9999 || year == 9999))) {
    // System.out.println("Not in range");
    // return false;
    // } else {
    // if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {

    // return true;

    // }
    // // step 5;
    // System.out.println("step 5");

    // return false;
    // }

    // }

    public static boolean areEqualByThreeDecimalPlaces(double firstParam, double secondParam) {

        int firstInt = (int) (firstParam * 1000);
        int secondInt = (int) (secondParam * 1000);
        if (firstInt - secondInt == 0) {
            // System.out.println("firstint = " + firstInt);
            // System.out.println("secondint = " + secondInt);

            return true;
        }

        return false;

    }

    public static boolean hasEqualSum(int firstParam, int secondParam, int thirdParam) {
        int sumOfFirstTwoParams = firstParam + secondParam;

        if (sumOfFirstTwoParams == thirdParam) {
            return true;
        }
        return false;

    }

    public static boolean hasTeen(int firstParam, int secondParam, int thirdParam) {

        if ((firstParam >= 13 && firstParam <= 19) || (secondParam >= 13 && secondParam <= 19)
                || (thirdParam >= 13 && thirdParam <= 19)) {
            return true;
        }
        return false;

    }

    public static boolean isTeen(int param) {
        if (param >= 13 && param <= 19) {
            return true;
        }
        return false;

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {

            // one inch =2.54cm
            // one foot = 12 inches,
            double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
            System.out.println("centimeters = " + centimeters);
            return centimeters;
        }
        System.out.println(" not in range");

        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {

            // one inch =2.54cm
            // one foot = 12 inches,
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;

            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

        return -1;

    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            // 1 hour = 60minutes;
            // 1 min = 60 seconds,

            int XX = (int) minutes / 60;
            int YY = (int) minutes % 60;

            return XX + "h " + YY + "m " + seconds + "s";
        }
        return INVALID_VALUE_MESSAGE;

    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            // 1 hour = 60minutes;
            // 1 min = 60 seconds,

            int minutes = (int) seconds / 60;
            int remainingSeconds = (int) seconds % 60;

            return getDurationString(minutes, remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;

    }

    public static double area(double radius) {

        if (radius >= 0) {
            return Math.PI * radius * radius;
        }

        return -1;

    }

    public static double area(double x, double y) {

        if (x >= 0 && y >= 0) {
            return x * y;
        }

        return -1;

    }

    public static void printYearsAndDays(long minutes) {

        // 1 hour = 60 minutes;
        // 1 day = 24 hours;
        // 1 year = 365 days;
        long hours = (long) minutes / 60;
        // long remainingMinutes = (long) minutes % 60;
        long days = (long) hours / 24;
        // long reaminingHours = (long) hours % 24;
        long years = (long) days / 365;
        long remainingDays = (long) days % 365;

        if (minutes >= 0) {
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        } else {

            System.out.println("Invalid Value");
        }

    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else {
            if ((a == b && a == c && b == c)) {
                System.out.println("All numbers are equal");

            } else if (a != b && a != c && b != c) {
                System.out.println("All numbers are different");

            } else {

                System.out.println("Neither all are equal or different");

            }

        }

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
            return false;
        } else if (!summer) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
            return false;
        }

        return false;

    }

    public static void testChar(char a) {
        switch (a) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E was found");
                break;
            default:
                System.out.println("not found");
                break;
        }

    }

    public static void printDayOfTheWeek(int a) {
        switch (a) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }

    public static void dayOfTheWeekChallange(int a) {

        if (a == 0) {

            System.out.println("Sunday");
            return;
        }
        if (a == 1) {

            System.out.println("Monday");
            return;
        }
        if (a == 2) {

            System.out.println("Tuesday");
            return;
        }
        if (a == 3) {

            System.out.println("Wednesday");
            return;
        }
        if (a == 4) {

            System.out.println("Thursday");
            return;
        }
        if (a == 5) {

            System.out.println("Friday");
            return;
        }
        if (a == 6) {

            System.out.println("Saturday");
            return;
        } else {
            System.out.println("Invalid day");
            return;
        }

    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            }

        }
        return false;

    }

    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {

            return -1;
        }
        boolean isLeapYearValue = isLeapYear(year);
        switch (month) {

            case 1:
                return 31;
            case 2:
                return isLeapYearValue ? 29 : 28;

            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                System.out.println("year def " + year);

                return -1;
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }

    public static void forLoop() {
        for (int i = 2; i < 9; i++) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

    }

    public static void forLoopReverse() {
        for (int i = 8; i >= 2; i--) {
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
        }

    }

    public static boolean isPrime(int n) {

        if (n == 1 || n == 0) {
            return false;

        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;

    }

    public static void primeCount(int[] arrayOfNumbers) {

        int count = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {

            if (isPrime(i)) {
                System.out.println(i);

                count++;
                if (count == 30) {
                    break;
                }

            }

        }

    }

    public static void sumThreeAndFive(int[] arrayOfNumbers) {
        int sum = 0;
        int counter = 0;

        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("this is the number => " + i);
                sum += i;
                counter++;
                System.out.println("this is the total sum of iterables ist => " + counter);

                if (counter == 5) {
                    System.out.println("this is the total sum of iterables => " + sum);
                    break;
                }
            }
        }

    }

    public static boolean isOdd(int number) {
        if (!(number > 0)) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        }

        return true;

    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }
        int sum = 0;

        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {
                sum += i;
            }

        }
        return sum;

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;

        }
        return false;

    }

    public static int getSumEvenNumbersOfFive() {

        int start = 4;
        int end = 20;
        int sum = 0;
        int evenFound = 0;

        while (start <= end) {
            start++;

            if (isEvenNumber(start)) {

                if (evenFound >= 5) {
                    break;
                }
                sum += start;
                evenFound++;
                System.out.println("Even found -> " + start);
                System.out.println("Total Even found til now -> " + evenFound);

            }
        }

        return sum;

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            System.out.println("Number is --> " + number);

            int digit = number % 10;
            System.out.println("Digit is --> " + digit);

            sum += digit;
            System.out.println("Sum is --> " + sum);

            number /= 10;

            System.out.println("Number is after division --> " + number);

        }
        return sum;

    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        if (number > 0) {
            temp *= -1;
        }
        int reverse = 0;
        int stored = temp;
        while (stored < 0) {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;
            System.out.println("number-> in loop " + number);
            System.out.println("temp-> in loop " + temp);
            System.out.println("reverse-> in loop " + reverse);
        }
        System.out.println("number-> " + number);
        System.out.println("temp-> " + temp);
        System.out.println("reverse-> " + reverse);
        if (temp == reverse) {

            return true;
        }

        return false;

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = 0;
        boolean lastDigitSet = false;
        int firstDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (!lastDigitSet) {
                lastDigitSet = true;
                lastDigit = digit;
            }
            firstDigit = digit;

            number /= 10;

        }
        sum = firstDigit + lastDigit;
        System.out.println("firstDigit -> " + firstDigit);
        System.out.println("lastDigit -> " + lastDigit);
        System.out.println("sum will be -> " + sum);

        return sum;

    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            if (digit % 2 == 0) {
                System.out.println("digit is even and -> " + digit);
                sum += digit;
                System.out.println("digit is even and current sum -> " + sum);

            }

        }
        System.out.println("STotal Sum -> " + sum);

        return sum;

    }

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            System.out.println("Invalid Value");

            return false;
        }

        boolean hasSameDigit = false;
        System.out.println("I am exe");
        if (!hasSameDigit) {

            while (a > 0) {
                if (hasSameDigit) {
                    break;
                }
                int aDigit = a % 10;
                int temB = b;

                while (temB > 0) {

                    // System.out.println("aDigit is equal to " + aDigit);

                    int bDigit = temB % 10;
                    temB /= 10;
                    // System.out.println("bDigit is equal to " + bDigit);
                    System.out.println(aDigit + " comparing " + bDigit);

                    if (aDigit == bDigit) {
                        System.out.println(aDigit + " is equal to " + bDigit);
                        hasSameDigit = true;
                    }
                    if (hasSameDigit) {
                        break;
                    }

                }
                a /= 10;

            }

        }
        System.out.println("Result is " + hasSameDigit);
        return hasSameDigit;

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) {

            return false;
        }

        boolean hasSameDigit = false;
        if (!hasSameDigit) {

            while (a > 0) {

                int aDigit = a % 10;
                int bDigit = b % 10;
                int cDigit = c % 10;
                if (aDigit == bDigit || aDigit == cDigit || bDigit == cDigit) {
                    if (aDigit == bDigit) {

                        System.out.println("a: " + aDigit + " is equal to b: " + bDigit);
                    }
                    if (bDigit == cDigit) {

                        System.out.println("b: " + bDigit + " is equal to c: " + cDigit);
                    }
                    if (aDigit == cDigit) {

                        System.out.println("a: " + aDigit + " is equal to c: " + cDigit);
                    }
                    hasSameDigit = true;
                }
                if (hasSameDigit) {
                    break;
                }
                break;

            }

        }
        System.out.println("Result is " + hasSameDigit);
        return hasSameDigit;

    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {

            return -1;
        }
        int grtRemainder = -1;

        for (int i = 1; i <= first; i++) {

            if (first % i == 0 && second % i == 0) {
                grtRemainder = i;
            }

        }
        System.out.println("Found greatest Remainder: " + grtRemainder);

        return grtRemainder;

    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {

            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {

                sum += i;
            }
        }
        System.out.println("Sum: " + sum + " And isPrefectNumber " + (sum == number));
        return sum == number;

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int revValue = (int) reverse(number);

        for (int i = 0; i < getDigitCount(number); i++) {
            int digit = revValue % 10;
            revValue /= 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }

    }

    public static int reverse(int number) {

        int reverseValue = 0;
        while (number != 0) {
            // 234
            int digit = number % 10;
            System.out.println("reverserValue is " + reverseValue + " digit is " + digit);
            System.out.println((reverseValue * 10) + digit);

            reverseValue = (reverseValue * 10) + digit;
            number /= 10;

        }

        return reverseValue;

    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        System.out.println("bigCount: " + bigCount + " smallCount: " + smallCount + " goal " + goal);
        if (bigCount < 0 || smallCount < 0 || goal < 0) {

            return false;
        }
        if (bigCount * 5 + smallCount < goal) {
            System.out.println("Condition: bigCount * 5 + smallCount < goal ===> " + false);

            return false;
        }
        if ((goal % 5 <= smallCount)) {
            System.out.println("Condition: goal % 5 <= smallCount ===> " + true);

            return true;
        }
        System.out.println("Condition: No condition ===> " + false);

        return false;
    }

    public static int getLargestPrime(int number) {
        if (number <= 0 || number == 1) {
            System.out.println("Found  Largest prime Number Invalid value => " + -1);

            return -1;
        }
        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) {
                System.out.println("Found prime Number => " + i);
                number = i;
            }
        }
        System.out.println("Found  Largest prime Number => " + number);

        return number;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        // for (int col = 0; col <= number; col++) {
        // System.out.println("*");

        // for (int row = col; row >= 0; row--) {
        // System.out.print("*");
        // }

        // }

        for (int row = 0; row < number; row++) {

            for (int col = 0; col < number; col++) {
                if (row == 0 || row == number - 1)
                    System.out.print("*"); // top and bottom rows
                else if (col == 0)
                    System.out.print("*"); // left col
                else if (col == number - 1)
                    System.out.print("*"); // right col
                else if (col == row)
                    System.out.print("*"); // diagonal down to right
                else if (col == number - 1 - row)
                    System.out.print("*"); // diagonal down to left
                // alternative to lines 7-11 // if(row==0 || row==number-1 || column==0 ||
                // column==number-1 || column==row || column==number-1-row)
                // System.out.print("*");
                else
                    System.out.print(" "); // empty space between numbers
            }
            System.out.println(""); // puts a return to the row

        }

    }

    public static void askForAgeAndNameInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth.");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }

    public static void readingUserInputChallange() {

        // Read 10 numbers from the console entered by the user and print the sum of
        // those numbers.
        // Create a Scanner like we did in the previous video.
        // Use the hasNextInt() method from the scanner to check if the user has entered
        // an int value.
        // If hasNextInt() returns false, print the message "Invalid number". Continue
        // reading until you have read 10 numbers.
        // Use the nextInt() method to get the number and add it to the sum.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + " :");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            } else {
                System.out.println("Invalid Number");

            }

            scanner.nextLine();

        }
        System.out.println("Your total sum for " + (counter) + " attempts is " + sum);

        scanner.close();

    }

    public static void minAndMaxInputChallange() {
        // Read the numbers from the console entered by the user and print minimum and
        // maximum number the user has entered.
        // Before the user enters the number, print the message "Enter number:",
        // If the user enters an invalid number, break out of the loop and print the
        // minimum and maximum number.

        // Hint :
        // * Use an endless while loop.
        // Bonus:
        // * Create a project with the name MinAndMaxInputChallange.

        Scanner scanner = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    minNumber = number;
                    maxNumber = number;

                }
                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < maxNumber) {
                    minNumber = number;

                }

            } else {
                System.out.println("Invalid number!!!");
                break;
            }
            scanner.nextLine();

        }

        System.out.println("You min is : " + minNumber);
        System.out.println("You max is : " + maxNumber);

        scanner.close();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (true) {

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            } else {
                long avg = 0;
                if (sum != 0 && counter != 0) {

                    avg = Math.round((double) sum / counter);
                }
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();

        }

        scanner.close();

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if ((width <= 0 || height <= 0 || areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        // Calculte the number of buckets.......
        double area = width * height;
        int buckets = (int) ((int) Math.ceil((double) area / areaPerBucket)) - (int) extraBuckets;

        System.out.println("Buckets needed : " + buckets);

        return buckets;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if ((width <= 0 || height <= 0 || areaPerBucket <= 0)) {
            return -1;
        }

        // Calculte the number of buckets.......
        double area = width * height;
        int buckets = (int) ((int) Math.ceil((double) area / areaPerBucket));

        System.out.println("Buckets needed : " + buckets);

        return buckets;

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if ((area <= 0 || areaPerBucket <= 0)) {
            return -1;
        }

        // Calculte the number of buckets.......

        int buckets = (int) (Math.ceil((double) area / areaPerBucket));

        System.out.println("Buckets needed : " + buckets);

        return buckets;

    }

}
