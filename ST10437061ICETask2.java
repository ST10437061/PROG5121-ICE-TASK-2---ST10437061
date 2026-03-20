package com.mycompany.st10437061icetask2;
import java.util.Scanner;
public class ST10437061ICETask2 {

    public static boolean checkIdentity(String name, String surname, int age) 
    { 
    return name.equals("Jack") && surname.equals("Khoza") && age == 25;
    }
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = scan.next();
            
            System.out.print("Enter surname: ");
            String surname = scan.next();
            
            System.out.print("Enter age: ");
            int age = scan.nextInt();
            
            boolean result = checkIdentity(name, surname, age);
            
            if (result) {
                System.out.println("It is Jack");
            } else {
                System.out.println("This is not Jack");
            }
        }
    }
}

