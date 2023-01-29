package com.bridgelabz;

import java.util.ArrayList;

public class Main {
    static CarInvoice carInvoice = new CarInvoice();
    public static void main(String[] args) {
        ArrayList<Integer> allRides = new ArrayList<>();
        allRides.add(carInvoice.calculateFare(5,13));
        allRides.add(carInvoice.calculateFare(7,16));
        allRides.add(carInvoice.calculateFare(3,9));
        System.out.println("Fares for rides are");
        System.out.println(allRides);
    }
}
