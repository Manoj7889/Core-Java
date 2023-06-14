package com.Traning;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       try {
            System.out.print("Enter the name: ");
            String input = scan.nextLine();
            System.out.println("You entered: " + input);
       } catch (InputMismatchException e) {
           System.out.println("Invalid input type. Please enter a string.");
       } catch (IllegalArgumentException e) {
            System.out.println("Entry invalid. Please try again.");
        } finally {
           scan.close();
        }
    }
}







