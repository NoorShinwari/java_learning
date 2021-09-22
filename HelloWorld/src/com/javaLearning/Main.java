package com.javaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    private static ArrayList<Album> albums = new ArrayList<Album>();

    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        // BankAccount uniCredit = new BankAccount(1111, 200, "some@one.com", "some",
        // "one", "+12 123 123456789");

        // uniCredit.deposit(300);
        // uniCredit.withdraw(400);
        // uniCredit.withdraw(200);

        // int[] myIntergers = getIntegers(5);
        // int[] sorted = sortIntegers(myIntergers);
        // printArray(sorted);

        // System.out.println("Enter count: ");
        // int count = scanner.nextInt();
        // scanner.nextLine();
        // int[] returnedArray = readIntegers(count);
        // int returnedMin = findMin(returnedArray);
        // System.out.println("Min Value: " + returnedMin);

        // int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // System.out.println("Array = " + Arrays.toString(array));
        // reverse(array);
        // System.out.println("Array after= " + Arrays.toString(array));

        // -----------------------------------------------------------------------------------
        // -----------------------------------------------ARRAYLIST------------------------------
        // groceryListHandler();

        // ----------------------------------------------------------------------------------------

        // -----------------------------------------BANK------------------------------------------
        // ---------------------------------------ACCOUNT-----------------------------------------

        // Bank bank = new Bank("National Australia Bank");

        // if (bank.addBranch("Adelaide")) {
        // System.out.println("Adelaide branch created");
        // }

        // bank.addCustomer("Adelaide", "Tim", 50.05);
        // bank.addCustomer("Adelaide", "Mike", 175.34);
        // bank.addCustomer("Adelaide", "Percy", 220.12);

        // bank.addBranch("Sydney");
        // bank.addCustomer("Sydney", "Bob", 150.54);

        // bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        // bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        // bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        // bank.listCustomers("Adelaide", true);
        // bank.listCustomers("Sydney", true);

        // bank.addBranch("Melbourne");

        // if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
        // System.out.println("Error Melbourne branch does not exist");
        // }

        // if (!bank.addBranch("Adelaide")) {
        // System.out.println("Adelaide branch already exists");
        // }

        // if (!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
        // System.out.println("Customer does not exist at branch");
        // }

        // if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
        // System.out.println("Customer Tim already exists");
        // }

        // ----------------------------------------------------------------------------------------

        // -------------------------------------PLAYLIST-ALBUM-SONG---------------------------------
        // Album album = new Album("Stormbringer", "Deep Purple");
        // album.addSong("Stormbringer", 4.6);
        // album.addSong("Love don't mean a thing", 4.22);
        // album.addSong("Holy man", 4.3);
        // album.addSong("Hold on", 5.6);
        // album.addSong("Lady double dealer", 3.21);
        // album.addSong("You can't do it right", 6.23);
        // album.addSong("High ball shooter", 4.27);
        // album.addSong("The gypsy", 4.2);
        // album.addSong("Soldier of fortune", 3.13);
        // albums.add(album);

        // album = new Album("For those about to rock", "AC/DC");
        // album.addSong("For those about to rock", 5.44);
        // album.addSong("I put the finger on you", 3.25);
        // album.addSong("Lets go", 3.45);
        // album.addSong("Inject the venom", 3.33);
        // album.addSong("Snowballed", 4.51);
        // album.addSong("Evil walks", 3.45);
        // album.addSong("C.O.D.", 5.25);
        // album.addSong("Breaking the rules", 5.32);
        // album.addSong("Night of the long knives", 5.12);
        // albums.add(album);

        // LinkedList<Song> playList = new LinkedList<Song>();
        // albums.get(0).addToPlayList("You can't do it right", playList);
        // albums.get(0).addToPlayList("Holy man", playList);
        // albums.get(0).addToPlayList("Speed king", playList); // Does not exist
        // albums.get(0).addToPlayList(9, playList);
        // albums.get(1).addToPlayList(8, playList);
        // albums.get(1).addToPlayList(3, playList);
        // albums.get(1).addToPlayList(2, playList);
        // albums.get(1).addToPlayList(24, playList); // There is no track 24

        // play(playList);

        // ---------------------------------------------------------------------------------------------------------------------------------------------

        // -------------------------------------------------------------BUTTON-------------------------------------------------------------------------

        // class ClickListener implements OnClickListener {

        // public ClickListener() {
        // System.out.println("I've been attached!");
        // }

        // @Override
        // public void onClick(String title) {
        // System.out.println(title + " was clicked");
        // }

        // }

        // btnPrint.setOnClickListener(new ClickListener());
        // listen();

        // ------------------------------------------------------------------ANONYMOUS----------------------------------------------------------------
        // btnPrint.setOnClickListener(new OnClickListener() {

        // @Override
        // public void onClick(String title) {

        // System.out.println(btnPrint.getTitle() + " is the button title");
        // System.out.println(title + " should be the title");
        // System.out.println(title + " was clicked");

        // }
        // });
        // listen();
        // -----------------------------------------------------------END---------------------------------------------------------------------------------

        // ------------------------------------------------------------LOOP-------------------------------------------------------------------------------

        // printWithLoopArrayList();

        // ---------------------------------------------------------------------------------------------------

    }

    private static void printWithLoopArrayList() {
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        items.add(7);

        for (Integer i : items) {
            System.out.println(i * 2);
        }

    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;

                default:
                    break;
            }
        }
    }

    private static void play(LinkedList<Song> playList) {
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" + "1 - to play next song\n" + "2 - to play previous song\n"
                + "3 - to replay the current song\n" + "4 - list songs in the playlist\n"
                + "5 - print available actions.\n" + "6 - delete current song from playlist");

    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " content " + array[i]);
        }

    }

    public static int[] sortIntegers(int[] array) {
        // int[] sortedArray = new int[array.length];

        // for (int i = 0; i < array.length; i++) {
        // sortedArray[i] = array[i];
        // ;
        // }

        // ANOTHER METHOD OF COPYING ARRAY;

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            System.out.println("Flag is true  while loop");
            flag = false;
            System.out.println("Flag is false while loop just after initiating");
            for (int i = 0; i < sortedArray.length - 1; i++) {
                System.out.println("for loop started");
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    System.out.println("I am temp " + temp);
                    System.out.println("I am sortedArray[i] " + sortedArray[i]);
                    System.out.println("I am sortedArray[i+1] " + sortedArray[i + 1]);

                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    System.out.println("I am temp " + temp);

                    flag = true;
                    System.out.println("Flag is true  for loop");

                }
            }
        }
        return sortedArray;

    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;

    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            // if(value>max){
            // max=value;
            // }
            if (value < min) {
                min = value;
            }
        }
        return min;

    }

    private static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            System.out.println("ind " + i);
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

    }

    public static void groceryListHandler() {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();

                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

                default:
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print the list of grocery items ");
        System.out.println("\t 2 - To add an item to the list. ");
        System.out.println("\t 3 - To modify an item in the list. ");
        System.out.println("\t 4 - To remove an item from the list. ");
        System.out.println("\t 5 - To search for an item in the list ");
        System.out.println("\t 6 - To quit the application. ");

    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());

    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item:  ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);

    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);

    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in your grocery list");
        } else {
            System.out.println(searchItem + " is not in the grocery list");
        }

    }

}
