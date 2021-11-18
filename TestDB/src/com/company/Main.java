package com.company;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\2021\\javaLearning\\TestDB\\" + DB_NAME;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " TEXT," +
                    COLUMN_PHONE + " INTEGER," +
                    COLUMN_EMAIL + " TEXT" +
                    " )"
            );
            insertContact(statement,"Tim", 12354678, "tim@email.com");
            insertContact(statement,"Joe", 2355667, "joe@anywhere.com");
            insertContact(statement,"Jane", 987234234, "jane@somewhere.com");
            insertContact(statement,"Fido", 12345676, "dog@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=5555555" +
                    " WHERE " +
                    COLUMN_NAME +
                    "='Jane'"
            );
            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " +
                    COLUMN_NAME +
                    "='Joe'"
            );

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL)
                );
            }
            
            results.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }


//        //       This method will close the database automatically;
////        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\2021\\javaLearning\\TestDB\\testjava.db");
////             Statement statement = connection.createStatement();) {
////            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
////        } catch (SQLException e) {
////            System.out.println("Something went wrong: " + e.getMessage());
////        }
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\2021\\javaLearning\\TestDB\\testjava.db");
////            connection.setAutoCommit(false);
//            Statement statement = connection.createStatement();
//
//            // We added the IF NOT EXISTS, it will only create a table if it doesn't exist.
//            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
////            statement.execute("INSERT INTO contacts (name, phone, email) " +
////                                    "VALUES ('Joe', 9876543, 'joe@anywhere.com')");
////            statement.execute("INSERT INTO contacts (name, phone, email) " +
////                                    "VALUES ('Jane', 4636795, 'jane@anywhere.com')");
////            statement.execute("INSERT INTO contacts (name, phone, email) " +
////                                    "VALUES ('Fido', 23967976, 'dog@email.com')");
////            statement.execute("UPDATE contacts SET phone = 5555555 WHERE name = 'Jane'");
//
////            statement.execute("DELETE from contacts WHERE name = 'Joe'");
//
////            statement.execute("SELECT * FROM contacts");
////            ResultSet results = statement.getResultSet();
////            while (results.next()) {
////                System.out.println(results.getString("name") + " " +
////                                   results.getInt("phone") + " " +
////                                   results.getString("email"));
////            }
////
////            results.close();
//            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
//            while (results.next()) {
//                System.out.println(results.getString("name") + " " +
//                                   results.getInt("phone") + " " +
//                                   results.getString("email"));
//            }
//            results.close();
//
//
//            // The order of closing is important:
//            // We should close the statements first then the connection:
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            System.out.println("Something went wrong: " + e.getMessage());
//        }
    }

    public static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {

        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" +
                name + "', "
                + phone + ", '" +
                email + "' )"
        );


    }
}
