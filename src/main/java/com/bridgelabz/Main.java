package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static CarInvoice carInvoice = new CarInvoice();
    public static void main(String[] args) {
        List<Integer> allRides = new ArrayList<>();
        allRides.add(carInvoice.calculateFare(5,13));
        allRides.add(carInvoice.calculateFare(7,16));
        allRides.add(carInvoice.calculateFare(3,9));
        System.out.println("Fares for rides are");
        for(int i = 0; i < allRides.size(); i++){
            System.out.println(allRides.get(i));
        }
        System.out.println("Total no.of rides is " + carInvoice.enhancedInvoice(allRides).get(0)
        + "\nTotal fare is " + carInvoice.enhancedInvoice(allRides).get(1)
        + "\nAverage fare per ride is " + carInvoice.enhancedInvoice(allRides).get(2));
    }
}
