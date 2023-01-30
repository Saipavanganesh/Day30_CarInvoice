package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static CarInvoice carInvoice = new CarInvoice();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Select an option");
            System.out.println("1.Add a ride details\n2.Search a user ride details\n3.Exit");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    List<Integer> allRides = new ArrayList<>();
                    System.out.println("Enter how many rides you took");
                    int rides = sc.nextInt();
                    System.out.println("Enter your user ID");
                    int userID = sc.nextInt();
                    for(int i=0; i<rides; i++){
                        System.out.println("Enter total distance covered in one ride");
                        int distance = sc.nextInt();
                        System.out.println("Enter total no.of minutes taken in one ride");
                        int min = sc.nextInt();
                        allRides.add(carInvoice.calculateFare(distance,min));
                    }
                    System.out.println("Fares for rides are");
                    for(int i = 0; i < allRides.size(); i++){
                        System.out.println(allRides.get(i));
                    }
                    System.out.println("Total no.of rides is " + carInvoice.enhancedInvoice(userID,allRides).get(0)
                            + "\nTotal fare is " + carInvoice.enhancedInvoice(userID,allRides).get(1)
                            + "\nAverage fare per ride is " + carInvoice.enhancedInvoice(userID,allRides).get(2));
                    System.out.println();
                    break;
                case 2:
                    carInvoice.getUserDetails();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct option\n");
                    break;
            }
        }
    }
}
