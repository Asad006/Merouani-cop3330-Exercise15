package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String usrPassword;

        App app = new App();

        System.out.println("What is the password?");
        usrPassword=scanner.nextLine();

        app.checkPassword(usrPassword);
    }

    private void checkPassword(String usrPassword) {
        String pass = "abc$123";
        if (usrPassword.equals(pass)){
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}
